package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
	
	@GetMapping("insertGoods")
	public String insertGoods(HttpServletRequest request) {
		String r = "ok";
		System.out.println("상품을 등록하였습니다");
		return r;
	}
	
	@GetMapping("updateGoods")
	public String updateGoods(HttpServletRequest request) {
		String r = "ok";
		System.out.println("상품수정 되었씁니다");
		return r;
	}
}
