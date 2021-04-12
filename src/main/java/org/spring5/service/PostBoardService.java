package org.spring5.service;

import java.util.List;

import org.spring5.domain.BoardAttachVO;
import org.spring5.domain.Criteria;
import org.spring5.domain.BoardVO;

public interface PostBoardService {
	
	
	//게시물 보기
	public List<BoardVO> postBoardGetList(Criteria cri);
	
	public int postBoardGetTotalCount(Criteria cri);
	
	//게시물 세부정보
	public BoardVO postBoardRead(Long bno);	
	public boolean viewCount(Long bno);
	
	//등록
	public void postBoardInsert(BoardVO boardVO);
	
	//수정
	public boolean postBoardModify(BoardVO BoardVO);
	
	//삭제
	public boolean postBoardDelete(Long bno);
	
	//첨부 파일
	public List<BoardAttachVO> postGetAttachList(Long bno);
}
