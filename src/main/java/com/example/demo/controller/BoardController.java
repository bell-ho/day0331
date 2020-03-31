package com.example.demo.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

	@GetMapping("/insertBoard")
	public String insertBoard(HttpServletRequest request) {
//		String uri = request.getRequestURI();
//		String ip = request.getRemoteAddr();
//		String time = new Date().toLocaleString();
//		
//		System.out.println("요청한 uri"+uri);
//		System.out.println("요청한 ip"+ip);
//		System.out.println("요청한 time"+time);
		
		System.out.println("게시물등록폼 get");
		String str = "ok";
		return str;
	}

	@PostMapping("/insertBoard")
	public String insertBoardOk(HttpServletRequest request) {
		System.out.println("게시물등록완료 post");
		String str = "ok";
		return str;
	}
}
