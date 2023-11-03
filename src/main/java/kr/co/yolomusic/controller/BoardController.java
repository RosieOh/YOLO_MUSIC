package kr.co.yolomusic.controller;

import kr.co.yolomusic.dto.Board;
import kr.co.yolomusic.service.BoardService;
import kr.co.yolomusic.util.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/board/*")
public class BoardController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private BoardService boardService;

    @GetMapping("list.do")
    public String getBoardList(HttpServletRequest request, Model model) throws Exception {
        logger.info("Hello Sir~👩‍💼");
        String type = request.getParameter("type");
        String keyword = request.getParameter("keyword");
        int curPage = request.getParameter("page") != null ? Integer.parseInt(request.getParameter("page")) : 1;

        Page page = new Page();
        page.setSearchType(type);
        page.setSearchKeyword(keyword);
        int total = boardService.totalCount(page);

        page.makeBlock(curPage, total);
        page.makeLastPageNum(total);
        page.makePostStart(curPage, total);

        model.addAttribute("type", type);
        model.addAttribute("keyword", keyword);
        model.addAttribute("page", page);
        model.addAttribute("curPage", curPage);

        List<Board> boardList = boardService.boardList(page);
        model.addAttribute("boardList", boardList);

        List<Board> selectComment = boardService.selectComment();
        model.addAttribute("selectComment", selectComment);

        List<Board> newBoard = boardService.newBoard();
        model.addAttribute("newBoard", newBoard);
        return "/board/boardList";
    }

    @GetMapping("detail.do")
    public String getBoardDetail(HttpServletRequest request, Model model) throws Exception{
        logger.info("게시판 세부사항 진입");
        int seq = Integer.parseInt(request.getParameter("seq"));
        Board dto = boardService.boardDetail(seq);
        model.addAttribute("dto", dto);
        return "/board/boardDetail";
    }

    @GetMapping("insert.do")
    public String insertForm(HttpServletRequest request, Model model) throws Exception {
        return "/board/boardInsert";
    }

    @PostMapping("insert.do")
    public String boardInsert(HttpServletRequest request, Model model) throws Exception {
        Board dto = new Board();
        dto.setTitle(request.getParameter("title"));
        dto.setContent(request.getParameter("content"));
        boardService.boardInsert(dto);
        return "redirect:list.do";
    }

    @GetMapping("delete.do")
    public String noticeDelete(HttpServletRequest request, Model model) throws Exception {
        int bno = Integer.parseInt(request.getParameter("bno"));
        boardService.boardDelete(bno);
        return "redirect:list.do";
    }

    @GetMapping("commentDelete.do")
    public String commentDelete(HttpServletRequest request, Model model) throws Exception {
        int bno = Integer.parseInt(request.getParameter("nno"));
        int cno = Integer.parseInt(request.getParameter("cno"));
        boardService.commentDelete(cno);
        return "redirect:detail.do?bno="+bno;
    }

    @GetMapping("edit.do")
    public String editForm(HttpServletRequest request, Model model) throws Exception {
        int bno = Integer.parseInt(request.getParameter("bno"));
        Board dto = boardService.boardDetail(bno);
        model.addAttribute("dto", dto);
        return "/board/boardEdit";
    }

    @PostMapping("edit.do")
    public String noticeEdit(HttpServletRequest request, Model model) throws Exception {
        int bno = Integer.parseInt(request.getParameter("bno"));
        Board dto = new Board();
        dto.setBno(bno);
        dto.setTitle(request.getParameter("title"));
        dto.setContent(request.getParameter("content"));
        boardService.boardEdit(dto);
        return "redirect:list.do";
    }

}