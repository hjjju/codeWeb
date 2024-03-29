package org.zerock.mapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class BoardmapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	/*
	 * @Test public void testGetList() { mapper.getList().forEach(board ->
	 * log.info(board)); }
	 */
/*	
	@Test
	public void insert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는글");
		board.setContent("새로 작성 하는 내용");
		board.setWriter("newbie");
		
		mapper.insert(board);
		log.info(board);
	}
	*/
	
/*
 * @Test public void insertSelectKey() { BoardVO board = new BoardVO();
 * board.setTitle("새로 작성하는글 select key");
 * board.setContent("새로 작성하는 내용 select key"); board.setWriter("newbie");
 * 
 * mapper.insertSelectKey(board); log.info(board); }
 */
	
/*
 * @Test public void read() { //존재하는 게시물 번호로 테스트 BoardVO board =
 * mapper.read(5L);
 * 
 * log.info(board); }
 */	
	
	
/*
 * @Test public void delete() { log.info("DELETE COUNT: " +mapper.delete(2L)); }
 */
	
	@Test
	public void update() {
		BoardVO board = new BoardVO();
		board.setBno(4L);
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		board.setWriter("user00");
		
		int count = mapper.update(board);
		log.info(board);
	}
	
	
}



