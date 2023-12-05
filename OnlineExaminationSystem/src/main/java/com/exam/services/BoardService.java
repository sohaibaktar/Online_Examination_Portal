package com.exam.services;

import java.util.List;

import com.exam.entity.BoardEntity;

public interface BoardService {

	List<BoardEntity> fetchAllBoard();
	
	BoardEntity addBoard(BoardEntity boardEntity);	//Add Board.
	
	String deleteBoard(int id); //Delete Customer By id
}
