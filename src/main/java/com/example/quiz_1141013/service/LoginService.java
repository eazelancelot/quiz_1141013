package com.example.quiz_1141013.service;

import org.springframework.stereotype.Service;

import com.example.quiz_1141013.constants.ResMessage;
import com.example.quiz_1141013.response.BasicRes;

@Service
public class LoginService {
	
	public BasicRes login() {
		return new BasicRes(ResMessage.SUCCESS.getCode(), ResMessage.SUCCESS.getMessage());
	}

}
