package com.MG.service;

import com.MG.domain.CustomerVO;
import com.MG.dto.CustomerDTO;

public interface CustomerService {
	
	//ȸ������
	public void join(CustomerVO vo) throws Exception;
	
	//�α���
	public CustomerVO login(CustomerDTO dto) throws Exception;
}
