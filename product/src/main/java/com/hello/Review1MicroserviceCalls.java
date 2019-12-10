package com.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${review1-service-url}", name = "review1")
public interface Review1MicroserviceCalls {

	@RequestMapping(method = RequestMethod.GET, value = "/review1/")
	public String getReview(@RequestParam() String productName);

}
