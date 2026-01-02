package com.example.quiz_1141013.service;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.quiz_1141013.constants.ResMessage;
import com.example.quiz_1141013.response.BasicRes;

//@EnableScheduling
@Service
public class LoginService {
	
	public BasicRes login() {
		return new BasicRes(ResMessage.SUCCESS.getCode(), ResMessage.SUCCESS.getMessage());
	}
	
	/*  單位:         秒 分 時 日 月 週*/
	@Scheduled(cron = "5/10 * * * * ?")
	public void test() {
		System.out.println(LocalDateTime.now());
	}

}
