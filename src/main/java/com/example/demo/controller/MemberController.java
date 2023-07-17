package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.MemberVO;
import com.google.gson.Gson;

@RestController
public class MemberController {

	@GetMapping("/getMember")
	public String member() {
		String str = "";
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(new MemberVO("김은영", "파주"));
		Gson gson = new Gson();
		str = "sist("+ gson.toJson(list)+")";
		return str;
	}
}





