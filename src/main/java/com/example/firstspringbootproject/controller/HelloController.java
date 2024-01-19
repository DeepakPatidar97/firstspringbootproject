package com.example.firstspringbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/HelloWorld")
	@ResponseBody
	public String helloWorld() {
		return "Hello World! How are you?";
	}
	
	@RequestMapping("/HelloWorldHtml")
	@ResponseBody
	public String hTMLHelloWorld() {
		StringBuilder builder = new StringBuilder();
		builder.append("<html>");
		builder.append("<head>");
		builder.append("<title> MyFirst spring boot project </title>");
		builder.append("<head>");
		builder.append("<Body>");
		builder.append("<h1>My first spring boot project using spring</h1>");
		builder.append("</body>");
		builder.append("</html");
		return builder.toString();
	}
	
	@RequestMapping("/HelloWorldJsp")
	public String jSPHelloWorld() {
		return "SayHello";
	}
}
