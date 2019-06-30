package kr.hs.dgsw.shop_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Product {

    private Long id;
    private int category;
    private String name;
    private String detail_info;
    private String buy_info;
    private String company;
    private int market_price;
    private int selling_price;
    private int point;
    private String img_path;
    private String img_name;
    private LocalDateTime created;
    private LocalDateTime updated;
}
