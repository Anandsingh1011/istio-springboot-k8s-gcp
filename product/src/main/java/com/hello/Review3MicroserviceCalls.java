package com.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${review3-service-url}", name = "review3")
public interface Review3MicroserviceCalls {

	@RequestMapping(method = RequestMethod.GET, value = "/review3/")
	public String getReview(@RequestParam() String productName);

}
