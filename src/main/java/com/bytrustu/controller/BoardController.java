package com.bytrustu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bytrustu.domain.BoardVO;
import com.bytrustu.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping(value="/board/*")
@Log4j
public class BoardController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		BoardVO board = new BoardVO();
		board.setId("쟁비서");
		board.setTitle("제목");
		board.setContent("내용");
		int result = service.test(board);
		return "home";
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String get() {
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		list = service.get();
		log.info(list);
		
		return "home";
	}
}
