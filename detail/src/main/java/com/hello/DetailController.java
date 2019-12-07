package com.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DetailController {

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String findDetail(String productName) {
		System.out.println("findDetail called : " + productName);
		String detail = "This is very good project " + productName + " !";
		return detail;

	}
}
