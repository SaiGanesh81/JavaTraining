package com.sopra.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Details {
	
	@RequestMapping("/info")
	public String info() {
		return "details";
	}
}
