package com.bpmlinks;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BpmlinksPocApplication {

	private static final String ENV_NAME="POC_ENV";
	
	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(BpmlinksPocApplication.class).profiles("local").build().run(args);
	}

}
