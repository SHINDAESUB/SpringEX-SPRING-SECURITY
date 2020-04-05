package org.daesub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@RequestMapping("/sample/*")
@Controller
@Log4j
public class SampleController {

	//�α��� ���� �ʾƵ� ��밡��
	@GetMapping("/all")
	public void doAll() {
		
		log.info("everybody");
	}
	
	//�α��� �� ����ڸ� �̿밡��
	@GetMapping("/member")
	public void doMember() {
		
		log.info("logined member");
	}
	
	//�����ڸ� ��밡��
	@GetMapping("/admin")
	public void doAdmin() {
		
		log.info("logined Admin");
	}
	
	
	
}
