package com.bytrustu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bytrustu.dao.BoardDAO;
import com.bytrustu.domain.BoardVO;
import com.bytrustu.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService  {

	/*@Autowired
	private BoardDAO dao;*/
	
	@Autowired
	private BoardMapper mapper;
	
	
	@Transactional
	@Override
	public int test(BoardVO board) {
		mapper.test5();
		return mapper.test(board);
	}


	@Override
	public List<BoardVO> get() {
		return mapper.get();
	}




	
	

	
	
}
