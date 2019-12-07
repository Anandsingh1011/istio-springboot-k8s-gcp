package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {

	@Autowired
	private ExternalService remoteService;

	@RequestMapping(value = "/product/{productName}", method = RequestMethod.GET)
	public ProductDTO getProductDetail(@PathVariable("productName") String productName) {

		ProductDTO dto = new ProductDTO();

		String detail = remoteService.getDetails(productName);

		dto.setName(productName);
		dto.setDetails(detail);
		
		return dto;

	}

}
