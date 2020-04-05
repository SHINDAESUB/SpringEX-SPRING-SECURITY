package org.daesub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@RequestMapping("/sample/*")
@Controller
@Log4j
public class SampleController {

	//로그인 하지 않아도 사용가능
	@GetMapping("/all")
	public void doAll() {
		
		log.info("everybody");
	}
	
	//로그인 한 사용자만 이용가능
	@GetMapping("/member")
	public void doMember() {
		
		log.info("logined member");
	}
	
	//관리자만 사용가능
	@GetMapping("/admin")
	public void doAdmin() {
		
		log.info("logined Admin");
	}
	
	
	
}
