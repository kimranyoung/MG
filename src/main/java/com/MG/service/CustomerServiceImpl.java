package com.MG.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.MG.domain.CustomerVO;
import com.MG.dto.CustomerDTO;
import com.MG.persistence.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Inject
	private CustomerDAO dao;
	
	//ȸ������
	public void join(CustomerVO vo) throws Exception{
		dao.insert(vo);
	}
	
	//�α���
	public CustomerVO login(CustomerDTO dto) throws Exception{
		return dao.login(dto);
	}
}
