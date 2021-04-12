package org.spring5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.spring5.domain.Criteria;
import org.spring5.domain.ReplyVO;

public interface PostReplyMapper {

	//댓글 추가
	public int postReplyInsert(ReplyVO replyVO);
	
	//댓글 조회
	public ReplyVO postReplyRead(Long rno);
	
	//댓글조회 페이징
	public List<ReplyVO> postReplyGetList(@Param("cri") Criteria cri,
									  @Param("bno") Long bno);
	
	//특정 게시글에 대한 - 댓글 갯수
	public Long postReplyGetCountByBno(Long bno);

	//댓글 삭제
	public int postReplyDelete(Long rno);
	
	//댓글 수정
	public int postReplyModify(ReplyVO replyVO);
	
	

}
