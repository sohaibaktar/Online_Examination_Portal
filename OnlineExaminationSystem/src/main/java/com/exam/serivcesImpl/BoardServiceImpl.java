package com.exam.serivcesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.BoardEntity;
import com.exam.repository.BoardRepository;
import com.exam.services.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardRepository boardRepo;

	@Override
	public List<BoardEntity> fetchAllBoard() {
		
		return boardRepo.findAll();
	}

}
