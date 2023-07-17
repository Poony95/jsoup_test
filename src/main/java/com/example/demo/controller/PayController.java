package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//<input type="hidden" name="imp_uid" id="imp_uid"/>
//<input type="hidden" name="merchant_uid" id="merchant_uid"/>
//<input type="hidden" name="paid_amount" id="paid_amount"/>
//<input type="hidden" name="apply_num" id="apply_num"/>

@RestController
public class PayController {
	
	@PostMapping("/payok")
	public String payok(String imp_uid, 
				String merchant_uid, 
				int paid_amount, 
				String apply_num) {
		System.out.println("imp_uid:"+imp_uid);
		System.out.println("merchant_uid:"+merchant_uid);
		System.out.println("paid_amount:"+paid_amount);
		System.out.println("apply_num:"+apply_num);		
		return "ok";
	}
}







