package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class MainController{
	
	private int flag = 0;
	
	@Autowired
	private DataImporter di;
	
	@RequestMapping(path="/search")
	public String showData(@RequestParam(value="keyword") String keyword, Model model) {
		if(flag==0)
		{
			di.importData();
			flag =1;
		}
		model.addAttribute("keyword", keyword);
		System.out.println(keyword);
		return "db";
	}
}