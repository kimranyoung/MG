package com.MG.service;

import com.MG.domain.CustomerVO;
import com.MG.dto.CustomerDTO;

public interface CustomerService {
	
	//회원가입
	public void join(CustomerVO vo) throws Exception;
	
	//로그인
	public CustomerVO login(CustomerDTO dto) throws Exception;
}
