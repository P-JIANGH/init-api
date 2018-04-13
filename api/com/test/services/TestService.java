package com.test.services;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
	
	@Transactional(readOnly = true)
	public Date getTime() {
		return new Date();
	}
}
