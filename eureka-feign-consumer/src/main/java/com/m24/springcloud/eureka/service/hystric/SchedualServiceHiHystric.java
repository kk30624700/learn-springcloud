package com.m24.springcloud.eureka.service.hystric;

import org.springframework.stereotype.Component;

import com.m24.springcloud.eureka.service.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
