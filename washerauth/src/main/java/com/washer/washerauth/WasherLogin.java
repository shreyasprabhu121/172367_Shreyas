package com.washer.washerauth;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.washer.washerauth.pojo.Washer;
import com.washer.washerauth.service.WasherService;

@Component
public class WasherLogin implements Function<Washer, Object> {
	
	@Autowired
	private WasherService washerService;

	@Override
	public Object apply(Washer t) {
		return washerService.login(t);
	}

}
