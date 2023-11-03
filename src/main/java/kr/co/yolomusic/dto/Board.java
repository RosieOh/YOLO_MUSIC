package kr.co.yolomusic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Board {
    private int bno;
    private String title;
    private String content;
    private String resdate;
    private int visit;
    private int count;
}
