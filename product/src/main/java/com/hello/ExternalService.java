package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExternalService {

	@Autowired
	private RemotePositionMicroserviceCalls remoteService;

	public String getDetails(String since) {
		String results = remoteService.getDetails(since);
		return results;

	}
}
