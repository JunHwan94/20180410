package com.junhwan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junhwan.models.Board;
import com.junhwan.repositories.BoardRepository;

@RestController
public class BoardController {
	
	@Autowired
	private BoardRepository boardRepository;
	
	@GetMapping
	public List<Board> getlistBoardByTitle(){
		return boardRepository.findByTitle("제목...1");
	}
}
