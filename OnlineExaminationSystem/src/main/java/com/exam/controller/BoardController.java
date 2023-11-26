package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.BoardEntity;
import com.exam.services.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/boards")
	public List<BoardEntity> fetchAllBoards(){
		
		return boardService.fetchAllBoard();
	}

}
