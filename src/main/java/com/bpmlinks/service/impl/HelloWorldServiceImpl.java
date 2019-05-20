package com.bpmlinks.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpmlinks.dao.HelloWorldRepository;
import com.bpmlinks.domain.response.HelloWorldResponse;
import com.bpmlinks.service.HelloWorldService;

@Service("helloWorldServiceImpl")
public class HelloWorldServiceImpl implements HelloWorldService{

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);
	
	@Autowired
	HelloWorldRepository helloWorldRepository;
	
	public HelloWorldResponse getMessage() {
		logger.info("Begin HelloWorldServiceImpl::getMessage");
		HelloWorldResponse helloWorldResponse = helloWorldRepository.findMessage();
		logger.info("Begin HelloWorldServiceImpl::getMessage");
		return helloWorldResponse;
	}
}
