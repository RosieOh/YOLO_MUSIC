package kr.co.yolomusic.service;

import kr.co.yolomusic.dao.FaqDAO;
import kr.co.yolomusic.dto.Faq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService{

    @Autowired
    private FaqDAO faqDAO;


    @Override
    public List<Faq> faqList() throws Exception {
        return faqDAO.faqList();
    }
}
