package kr.co.yolomusic.service;

import kr.co.yolomusic.dao.BoardDAO;
import kr.co.yolomusic.dto.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO boardDAO;

    @Override
    public List<Board> boardList() throws Exception {
        return boardDAO.boardList();
    }

    @Override
    public Board boardDetail(int seq) throws Exception {
        return boardDAO.boardDetail(seq);
    }

    @Override
    public void boardInsert(Board dto) throws Exception {
        boardDAO.boardInsert(dto);
    }

    @Override
    public void boardDelete(int seq) throws Exception {
        boardDAO.boardDelete(seq);
    }

    @Override
    public void boardEdit(Board dto) throws Exception {
        boardDAO.boardEdit(dto);
    }
}
