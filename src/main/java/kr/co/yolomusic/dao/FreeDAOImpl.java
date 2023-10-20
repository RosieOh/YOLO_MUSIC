package kr.co.yolomusic.dao;

import kr.co.yolomusic.dto.Free;
import kr.co.yolomusic.dto.FreeComment;
import kr.co.yolomusic.dto.Reco;
import kr.co.yolomusic.util.Page;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class FreeDAOImpl implements FreeDAO {
    @Autowired
    SqlSession sqlSession;

    @Override
    public List<Free> freeList(Page page) throws Exception {
        return sqlSession.selectList("free.freeList", page);
    }

    @Transactional
    @Override
    public Free freeDetail(int bno) throws Exception {
        return null;
    }

    @Override
    public void freeInsert(Free dto) throws Exception {

    }

    @Override
    public void freeDelete(int bno) throws Exception {

    }

    @Override
    public void freeEdit(Free dto) throws Exception {

    }

    @Override
    public int totalCount(Page page) throws Exception {
        return 0;
    }

    @Override
    public List<Free> freeBestRecList() throws Exception {
        return null;
    }

    @Override
    public List<Free> freeBestCmtList() throws Exception {
        return null;
    }

    @Override
    public List<FreeComment> freeCommentList(int bno) throws Exception {
        return null;
    }

    @Override
    public void commentInsert(FreeComment dto) throws Exception {

    }

    @Override
    public void commentDelete(int cno) throws Exception {

    }

    @Override
    public List<Free> commentCount() throws Exception {
        return null;
    }

    @Override
    public Reco findReco(int bno, String id) throws Exception {
        return null;
    }

    @Override
    public Reco memberFindReco(Reco reco) throws Exception {
        return null;
    }

    @Override
    public int insertReco(Reco reco) throws Exception {
        return 0;
    }

    @Override
    public void deleteReco(Reco reco) throws Exception {

    }

    @Override
    public void increaseRec(Reco reco) throws Exception {

    }

    @Override
    public void decreaseRec(Reco reco) throws Exception {

    }
}
