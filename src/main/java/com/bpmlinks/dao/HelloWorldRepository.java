package com.bpmlinks.dao;

import com.bpmlinks.domain.response.HelloWorldResponse;

public interface HelloWorldRepository{

	HelloWorldResponse findMessage();
}
