package com.hello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ExternalService remoteService;

	@RequestMapping(value = "/product/{productName}", method = RequestMethod.GET)
	public ProductDTO getProductDetail(@PathVariable("productName") String productName) {

		log.info("getProductDetail called  : " + productName);
		ProductDTO dto = new ProductDTO();

		String detail = "";
		
		try {
			detail = remoteService.getDetails(productName);
		} catch (Exception e) {
			log.error("Error calling remoteService.getDetails " + productName);
			e.printStackTrace();
		}

		dto.setName(productName);
		dto.setDetails(detail);
		
		return dto;

	}

}
