package com.washer.washerauth;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.washer.washerauth.pojo.Washer;

public class MainHandler extends SpringBootRequestHandler<Washer, Object> {

}
