package com.MG.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.MG.domain.CustomerVO;
import com.MG.dto.CustomerDTO;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Inject
	private SqlSession session;
	
	private static final String namespace="com.MG.mapper.CustomerMapper";
	
	//데이터 삽입
	public void insert(CustomerVO vo) throws Exception{
		session.insert(namespace+".insert",vo);
	}
	
	//로그인
	public CustomerVO login(CustomerDTO dto) throws Exception{
		return session.selectOne(namespace+".login", dto);
	}
}
