package com.exam.services;

import java.util.List;

import com.exam.entity.BoardEntity;

public interface BoardService {

	List<BoardEntity> fetchAllBoard();
}
