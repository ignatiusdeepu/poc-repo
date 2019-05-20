package com.bpmlinks.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpmlinks.domain.response.HelloWorldResponse;
import com.bpmlinks.domain.response.StandardResponse;
import com.bpmlinks.service.HelloWorldService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "/hello")
@RestController
@RequestMapping("/hello")
public class HelloworldController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloworldController.class);
	
	@Autowired
	HelloWorldService helloWorldService;
	
	@ApiOperation(value = "Returns a hello world message")
	@GetMapping(path = "/message", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public StandardResponse<HelloWorldResponse> getMessage() throws Exception {
		logger.info("Begin HelloworldController::getMessage");
		final StandardResponse<HelloWorldResponse> standardResponse = new StandardResponse<HelloWorldResponse>();
		standardResponse.setResponseOK();
		standardResponse.setData(helloWorldService.getMessage());
		logger.info("End HelloworldController::getMessage");
		return standardResponse;
	}
}
