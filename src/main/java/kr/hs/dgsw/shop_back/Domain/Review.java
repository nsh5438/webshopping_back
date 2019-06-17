package kr.hs.dgsw.shop_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Review {

    private Long id;
    private Long user_id;
    private Long product_id;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;
}
