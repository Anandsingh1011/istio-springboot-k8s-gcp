package com.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DetailController {
	
	private static final Logger log = LoggerFactory.getLogger(DetailController.class);

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String findDetail(String productName) {
		log.info("findDetail called : " + productName);
		String detail = "This is very good project " + productName + " !";
		return detail;

	}
}
