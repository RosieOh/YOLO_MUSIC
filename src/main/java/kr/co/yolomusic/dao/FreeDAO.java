package kr.co.yolomusic.dao;

import kr.co.yolomusic.dto.Free;
import kr.co.yolomusic.dto.FreeComment;
import kr.co.yolomusic.dto.Reco;
import kr.co.yolomusic.util.Page;

import java.util.List;

public interface FreeDAO {
    public List<Free> freeList(Page page) throws Exception;
    public Free freeDetail(int bno) throws Exception;
    public void freeInsert(Free dto) throws Exception;
    public void freeDelete(int bno) throws Exception;
    public void freeEdit(Free dto) throws Exception;
    public int totalCount(Page page) throws Exception;
    public List<Free> freeBestRecList() throws Exception;
    public List<Free> freeBestCmtList() throws Exception;
    public List<FreeComment> freeCommentList(int bno) throws Exception;
    public void commentInsert(FreeComment dto) throws Exception;
    public void commentDelete(int cno) throws Exception;
    public List<Free> commentCount() throws Exception;
    public Reco findReco(int bno, String id) throws Exception;
    public Reco memberFindReco(Reco reco) throws Exception;
    public int insertReco(Reco reco) throws Exception;
    public void deleteReco(Reco reco) throws Exception;
    public void increaseRec(Reco reco) throws Exception;
    public void decreaseRec(Reco reco) throws Exception;

}
