package kr.co.yolomusic.service;

import kr.co.yolomusic.dto.Board;
import kr.co.yolomusic.dto.BoardComment;
import kr.co.yolomusic.util.Page;

import java.util.List;

public interface BoardService {
    public List<Board> boardList(Page page) throws Exception;
    public Board boardDetail(int bno) throws Exception;
    public void boardInsert(Board dto) throws Exception;
    public void boardDelete(int bno) throws Exception;
    public void boardEdit(Board dto) throws Exception;
    public int totalCount(Page page) throws Exception;
    public List<BoardComment> boardCommentList(int bno) throws Exception;
    public void commentInsert(BoardComment dto) throws Exception;
    public void commentDelete(int cno) throws Exception;
    public List<Board> selectComment() throws Exception;
    public List<Board> countComment() throws Exception;
    public List<Board> newBoard() throws Exception;
}
