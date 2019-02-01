package com.bytrustu.dao;

import java.util.List;

import com.bytrustu.domain.BoardVO;

public interface BoardDAO {

	int test(BoardVO board);

	List<BoardVO> get();

}
