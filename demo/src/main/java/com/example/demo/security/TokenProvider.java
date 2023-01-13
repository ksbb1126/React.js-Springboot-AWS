package com.example.demo.security;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TokenProvider {
	private static final String SECRET_KEY = "FlRpX30pMqDbiAkmlfArbrmVkDD4RqISskGZmBFax5oGVxzXXWUzTR5JyskiHMIV9M1Oicegkpi46AdvrcX1E6CmTUBc6IFbTPiD";
	
	public String create(UserEntity userEntity) {
		
		return null;
	}
}
