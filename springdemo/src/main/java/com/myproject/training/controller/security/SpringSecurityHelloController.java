/**
 * 
 */
package com.myproject.training.controller.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shiva koduri
 *
 */
@Controller
@RequestMapping("/")
public class SpringSecurityHelloController {

	@RequestMapping("/public")
	public String accessPublicPage(Model model){
		model.addAttribute("message", "This page is publicly accessible. No Authentication is required");
		
		return "public";
	}
	
	@RequestMapping("/secured/mypage")
	public String accessSecuredPage(Model model){
		model.addAttribute("message", "Only you are authenticated and authorized to view this page");
		
		return "mypage";
	}
	
	
}
