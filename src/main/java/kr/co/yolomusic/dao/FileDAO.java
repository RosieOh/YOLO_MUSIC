package kr.co.yolomusic.dao;

import kr.co.yolomusic.dto.FileDTO;
import kr.co.yolomusic.dto.FileVO;

import java.util.List;

public interface FileDAO {
    public void insertFileboard(FileVO fileboard) throws Exception;
    public List<FileVO> getFileList() throws Exception;
    public List<FileDTO> getFileGroupList(int postNo) throws Exception;
    public FileVO getFilebord(int postNo) throws Exception;
    public FileVO getFileObject(int no) throws Exception;
    public void removeFileboard(int postNo) throws Exception;
    public void fileRemove(int no) throws Exception;
    public FileDTO getFile(int no) throws Exception;
}
