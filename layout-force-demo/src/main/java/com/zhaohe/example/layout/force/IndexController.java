package com.zhaohe.example.layout.force;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/xml")
	public String xml(Model model) {
		return "graph-force-xml";
	}

	@RequestMapping("/json")
	public String json(Model model) {
		return "graph-force-json";
	}
}
