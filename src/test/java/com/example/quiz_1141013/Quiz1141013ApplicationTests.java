package com.example.quiz_1141013;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.quiz_1141013.dao.QuizDao;

@SpringBootTest
class Quiz1141013ApplicationTests {
	
	@Value("${aaaa:500}")
	private int number;

	@Autowired
	private QuizDao quizDao;
	
	@Test
	void contextLoads() {
		System.out.println(number);
		int res = quizDao.update(30, "ABC", "ABC", LocalDate.of(2025, 12, 21), 
				LocalDate.of(2025, 12, 31), true);
		System.out.println(res);
	}

}
