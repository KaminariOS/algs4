package com.chanos.algs4.Controller;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
@Data
public class MemberReadHistory {
    @Id
    private String id;
    private Long memberId;
    private String memberNickname;
    private String memberIcon;
     private Long productId;
    private String productName;
    private String productPic;
    private String productSubTitle;
    private String productPrice;
    private Date createTime;
}
