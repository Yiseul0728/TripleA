package org.spring5.mapper;

import java.util.List;

import org.spring5.domain.BoardVO;
import org.spring5.domain.Criteria;

public interface PostBoardMapper {

	
	public List<BoardVO> postBoardGetList(Criteria cri);
	
	public List<BoardVO> postBoardGetListWithPagingAndSearching(Criteria cri);
	
	//총 게시물 개수
	public int postBoardGetTotalCount(Criteria cri);
	
	//게시글 추가(Insert)
	public int postBoardInsert(BoardVO boardVO);
	
	//게시글 상세보기(Read)
	public BoardVO postBoardRead(Long bno);
	public int viewCount(Long bno);
	
	//게시글 수정
	public int postBoardModify(BoardVO boardVO);
	
	//게시글 삭제 (Delete)
	public int postBoardDelete(Long bno);
	
}

