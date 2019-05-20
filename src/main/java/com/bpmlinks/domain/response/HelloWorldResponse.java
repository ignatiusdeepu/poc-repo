package com.bpmlinks.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "HelloWorldResponse", description = "HelloWorld Response Model")
public class HelloWorldResponse {

	@ApiModelProperty(notes = "code")
	@JsonProperty("code")
	private String code;
	
	@ApiModelProperty(notes = "message")
	@JsonProperty("message")
	private String message;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
