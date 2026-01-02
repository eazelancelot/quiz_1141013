package com.example.quiz_1141013.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz_1141013.request.FillinReq;
import com.example.quiz_1141013.response.BasicRes;
import com.example.quiz_1141013.response.StatisticsRes;
import com.example.quiz_1141013.service.FeedbackService;
import com.example.quiz_1141013.service.FillinService;

import jakarta.validation.Valid;

@RestController
public class FillinController {
	
	@Autowired
	private FillinService fillinService;
	
	@Autowired
	private FeedbackService feedbackService;
	
	@PostMapping(value = "quiz/fillin")
//	@RequestMapping(method = RequestMethod.POST, value = "quiz/fillin")
	public BasicRes fillin(@Valid @RequestBody FillinReq req) throws Exception {
		return fillinService.fillin(req);
	}
	
	@GetMapping(value = "quiz/statistics_test")
	public StatisticsRes statistics_test(@RequestParam("quizId") int quizId) throws Exception {
		return feedbackService.statistics_test(quizId);
	}

}
