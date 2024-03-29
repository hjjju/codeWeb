package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	//spring 4.3이상에서 자동처리
	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		log.info("register......" +board);

		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("get......"  + bno);
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("modify......" + board);
		
		//정상적으로 수정, 삭제가 이루어 지면 1이라는값이 반환 되기때문에 == 연산자 사용가능.
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("delete......" + bno);
		
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList() {
		log.info("getList......");
		return mapper.getList();
	}
	
	
}
