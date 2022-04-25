package template.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@RequestMapping(value = "/test" )
	public String index(@RequestParam(defaultValue = "test") String name, Model model) {
		System.out.println("IndexController");
		model.addAttribute("message", "Hello : "+name);
		return "/WEB-INF/views/main.jsp";
	}
}
