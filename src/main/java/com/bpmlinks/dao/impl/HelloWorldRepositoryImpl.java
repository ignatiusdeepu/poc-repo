package com.bpmlinks.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.bpmlinks.dao.HelloWorldRepository;
import com.bpmlinks.domain.response.HelloWorldResponse;

@Repository("helloWorldRepository")
public class HelloWorldRepositoryImpl implements HelloWorldRepository{

private static final Logger logger = LoggerFactory.getLogger(HelloWorldRepositoryImpl.class);
	
	public HelloWorldResponse findMessage() {
		logger.info("Begin HelloWorldRepositoryImpl::getMessage");
		HelloWorldResponse helloWorldResponse = new HelloWorldResponse();
		helloWorldResponse.setCode("HELLO");
		helloWorldResponse.setMessage("HelloWorld");
		logger.info("Begin HelloWorldRepositoryImpl::getMessage");
		return helloWorldResponse;
	}
}
