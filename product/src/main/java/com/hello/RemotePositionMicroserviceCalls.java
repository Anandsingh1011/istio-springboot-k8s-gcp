package com.hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${detail-service-url}", name = "productdetail")
public interface RemotePositionMicroserviceCalls {

	@RequestMapping(method = RequestMethod.GET, value = "/details/")
	public String getDetails(@RequestParam() String productName);

}
