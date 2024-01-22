package com.example.firstspringbootproject.controller;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;




@Controller
@SessionAttributes("username")
public class LoginController {
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
	
	
	/*
	 * private AuthenticationService authonticationService;
	 * 
	 * public LoginController(AuthenticationService authonticationService) {
	 * this.authonticationService = authonticationService; }
	 */
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String indexPage(ModelMap model) {
		model.put("username", "Deepak Patidar");
		return "welcome";
	}
	
	/*
	 * @RequestMapping(value = "/login",method = RequestMethod.GET) public String
	 * LoginPage() { return "login"; }
	 * 
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public String
	 * login(@RequestParam("username") String username, @RequestParam("password")
	 * String password, ModelMap model) {
	 * if(authonticationService.authentication(username, password)) {
	 * model.put("username", username); return "welcome"; } model.put("error",
	 * "Invalid username and password!"); return "login"; }
	 * 
	 * @RequestMapping("/welcome") public String welcome(@RequestParam String name,
	 * ModelMap map) {
	 * 
	 * return "welcome"; }
	 */
}
