package org.spring5.service;

import org.spring5.domain.Criteria;
import org.spring5.domain.ReplyPageDTO;
import org.spring5.domain.ReplyVO;

public interface PostReplyService {

	//댓글 추가
	public int postReplyInsert(ReplyVO replyVO);
		
	//댓글조회
	public ReplyVO postReplyRead(Long rno);
	
	//댓글조회 : 댓글 갯수 & 댓글목록 정보 (페이징)
	public ReplyPageDTO postReplyGetList(Criteria cri, Long bno);
		
	//댓글 삭제
	public int postReplyDelete(Long rno);
		
	//댓글 수정
	public int postReplyModify(ReplyVO replyVO);
}
