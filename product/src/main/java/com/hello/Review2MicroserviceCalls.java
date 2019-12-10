package com.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${review2-service-url}", name = "review2")
public interface Review2MicroserviceCalls {

	@RequestMapping(method = RequestMethod.GET, value = "/review2/")
	public String getReview(@RequestParam() String productName);

}
