package com.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${retting-service-url}", name = "retting")
public interface RettingMicroserviceCalls {

	@RequestMapping(method = RequestMethod.GET, value = "/retting/")
	public String getRettings(@RequestParam() String productName);

}
