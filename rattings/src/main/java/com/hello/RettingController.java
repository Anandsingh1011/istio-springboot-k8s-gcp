package com.hello;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RettingController {

	private static final Logger log = LoggerFactory.getLogger(RettingController.class);

	@RequestMapping(value = "/retting", method = RequestMethod.GET)
	public String findRetting(String productName) {

		log.info("findRetting called : " + productName);

		String detail = "Retting is  " + getRandomNumberInRange(1, 5) + " !";

		return detail;

	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
