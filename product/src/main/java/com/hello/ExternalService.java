package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalService {

	@Autowired
	private DetailMicroserviceCalls detailService;

	@Autowired
	private RettingMicroserviceCalls rettingService;

	@Autowired
	private Review1MicroserviceCalls review1Service;

	@Autowired
	private Review2MicroserviceCalls review2Service;

	@Autowired
	private Review3MicroserviceCalls review3Service;

	public ProductDTO getProductDetailDTO(String product) {
		ProductDTO dto = new ProductDTO();

		dto.setName(product);
		dto.setDetails(detailService.getDetails(product));
		dto.setRetting(rettingService.getRettings(product));
		dto.setReview1(review1Service.getReview(product));
		dto.setReview1(review2Service.getReview(product));
		dto.setReview1(review3Service.getReview(product));

		return dto;
	}

	public String getDetails(String product) {
		String results = detailService.getDetails(product);
		return results;
	}

	public String getRetting(String product) {
		String results = detailService.getDetails(product);
		return results;
	}

	public String getReview1(String product) {
		String results = detailService.getDetails(product);
		return results;
	}

	public String getReview2(String product) {
		String results = detailService.getDetails(product);
		return results;
	}

	public String getReview3(String product) {
		String results = detailService.getDetails(product);
		return results;
	}

}
