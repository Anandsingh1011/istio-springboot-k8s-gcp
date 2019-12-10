package com.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Review2Controller {
	
	private static final Logger log = LoggerFactory.getLogger(Review2Controller.class);

	@RequestMapping(value = "/review", method = RequestMethod.GET)
	public String findReview2(String productName) {

		log.info("findReview2 called : " + productName);

		String detail = "Product is very good";

		return detail;

	}

	

}
