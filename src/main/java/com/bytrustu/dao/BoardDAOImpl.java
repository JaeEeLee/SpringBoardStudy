package com.bytrustu.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bytrustu.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static String namespace = "com.bytrustu.mapper.BoardMapper";

	@Override
	public int test(BoardVO board) {
		return sqlSession.insert(namespace+".test", board);
	}

	@Override
	public List<BoardVO> get() {
		return sqlSession.selectList("com.bytrustu.mapper.BoardMapper.get");
	}
	
	
	
}
