package com.MG.persistence;

import com.MG.domain.CustomerVO;
import com.MG.dto.CustomerDTO;

public interface CustomerDAO {

	//데이터 삽입
	public void insert(CustomerVO vo) throws Exception;
	
	//로그인
	public CustomerVO login(CustomerDTO dto) throws Exception;
}
