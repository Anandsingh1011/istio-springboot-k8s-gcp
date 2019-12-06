package com.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ProductDTO getProductDetail() {
		
		ProductDTO dto = new ProductDTO();
		
		return dto;
		
		
	}

		
}
