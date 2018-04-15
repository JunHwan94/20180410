package com.junhwan.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.junhwan.models.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{
	List<Board> findByTitle(final String title);
}
