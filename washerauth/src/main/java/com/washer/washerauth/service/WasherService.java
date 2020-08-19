package com.washer.washerauth.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washer.washerauth.pojo.Washer;
import com.washer.washerauth.repo.WasherRepo;

@Service
public class WasherService {
	
	@Autowired
	private WasherRepo washerRepo;
	
	
	public Object login(Washer washer)
	{
		      washerRepo.insert(washer);
			  return "signup done";
	
		
	}

	

}
