package com.junhwan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.junhwan.models.Board;
import com.junhwan.repositories.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testInsert200() {
		for(int i=1 ; i <= 200; i++) {
			Board board = new Board();
			board.setTitle("제목..." + i);
			board.setContent("내용...");
			board.setWriter("user0");
			boardRepository.save(board);
		}
	}
	
}
