package com.MG.www;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.MG.domain.CustomerVO;
import com.MG.service.CustomerService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private CustomerService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime",    formattedDate );
		
		return "home";
	}
	
	//회원가입
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public void joinGET(CustomerVO vo, Model model) throws Exception{
		logger.info("joinGET complete");
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinPOST(CustomerVO vo, Model model) throws Exception{
		logger.info("joinPOST complete");
		
		service.join(vo);
		model.addAttribute("result","success");
		
		return "/success";
	}
	
}
