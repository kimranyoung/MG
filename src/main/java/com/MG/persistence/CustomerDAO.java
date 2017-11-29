package com.MG.persistence;

import com.MG.domain.CustomerVO;
import com.MG.dto.CustomerDTO;

public interface CustomerDAO {

	//������ ����
	public void insert(CustomerVO vo) throws Exception;
	
	//�α���
	public CustomerVO login(CustomerDTO dto) throws Exception;
}
