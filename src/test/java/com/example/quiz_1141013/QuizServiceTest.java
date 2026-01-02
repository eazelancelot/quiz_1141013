package com.example.quiz_1141013;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.quiz_1141013.constants.ResMessage;
import com.example.quiz_1141013.request.QuizCreateReq;
import com.example.quiz_1141013.response.BasicRes;
import com.example.quiz_1141013.service.QuizService;
import com.example.quiz_1141013.vo.QuestionVo;

@TestInstance(Lifecycle.PER_CLASS)
@SpringBootTest
public class QuizServiceTest {

	@Autowired
	private QuizService quizService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("=============  Before Each !!================");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("=============  After Each !!================");
	}
	
	@BeforeAll
	public void beforeAll() {
		System.out.println(" 可用於新增測試資料用 !!");
		System.out.println("=============  Before All !!================");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println(" 刪除一開始新增的測試資料 !!");
		System.out.println("=============  After All !!================");
	}
	
	@Test
	public void createQuizTest() {
		
		QuestionVo vo = new QuestionVo(1, 1, "Test123" , "Type_ABC", false, new ArrayList<>());
		QuizCreateReq req = new QuizCreateReq("", "Test", LocalDate.of(2025, 12, 30), //
				LocalDate.of(2025, 12, 29), false, List.of(vo));
		
		try {
			/* 1. 測試 date */
			BasicRes res = quizService.create(req);
			Assert.isTrue(res.getMessage().equals(ResMessage.DATE_ERROR.getMessage()), "Test Date Error!!");
			System.out.println("================");
			/* 2. 測試 type */
			req = new QuizCreateReq("", "Test", LocalDate.of(2025, 12, 30), //
					LocalDate.of(2025, 12, 30), false, List.of(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void typeTest() {
		System.out.println("################");
	}
}
