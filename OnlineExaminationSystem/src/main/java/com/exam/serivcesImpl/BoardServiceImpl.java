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

	@Override
	public BoardEntity addBoard(BoardEntity boardEntity) {
		
		return boardRepo.save(boardEntity);
	}

	@Override
	public String deleteBoard(int id) {
		
		if(boardRepo.findById(id).isPresent()) {
			
			boardRepo.deleteById(id);
			
			return "Successfully remove the Board";
		}
		return "Sorry no such customer found";
	}

}
