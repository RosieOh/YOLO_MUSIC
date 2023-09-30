package kr.co.yolomusic.dto;

import lombok.Data;

@Data
public class FreeComment {
    private int cno;
    private int bno;
    private String content;
    private String resdate;
    private String author;
    private String name;
}
