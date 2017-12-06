package com.MG.www;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.MG.domain.CustomerVO;
import com.MG.dto.CustomerDTO;
import com.MG.service.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerContorller {

	@Inject
	private CustomerService service;
	
	
	//�α���
	@RequestMapping(value="/login", method=RequestMethod.GET )
	public void loginGET(@ModelAttribute("dto") CustomerDTO dto, HttpSession session) {
		System.out.println("loginGET complete");
		
	}
	
	@RequestMapping(value="/loginPost", method=RequestMethod.POST)
	public String loginPOST(CustomerDTO dto, HttpSession session, Model model) throws Exception{
		CustomerVO vo=service.login(dto);
		
		if(vo.getUserID()==dto.getUserID()&&vo.getUserPW()==dto.getUserPW()) {
			model.addAttribute("CustomerVO", vo);
			return "redirect:/cart";
		}else {
			return "redirect:/join";
		}
	}
	
}
