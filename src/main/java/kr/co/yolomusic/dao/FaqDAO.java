package kr.co.yolomusic.dao;
import kr.co.yolomusic.dto.Faq;
import java.util.List;

public interface FaqDAO {
    public List<Faq> faqList() throws Exception;
}
