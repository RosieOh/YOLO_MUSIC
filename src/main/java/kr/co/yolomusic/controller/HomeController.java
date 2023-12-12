package kr.co.yolomusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class HomeController {
    // http:localhost:8081/yolomusic_war => / => /WEB-INF/views/index.jsp

    @RequestMapping("/")
    public String home(Locale locale, Model model) {
        return "/index";
    }
}
