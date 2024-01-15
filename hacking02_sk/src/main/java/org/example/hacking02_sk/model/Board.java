package org.example.hacking02_sk.model;

import lombok.Data;
import java.util.Date;
import org.apache.ibatis.type.Alias;

@Alias("board")
@Data
public class Board {
    int mybnum, myviewcount;
    String mytitle, mywriter, mycontent, myfilepath;
    Date myregdate;
}
