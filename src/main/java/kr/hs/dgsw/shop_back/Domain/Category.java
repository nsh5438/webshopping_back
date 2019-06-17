package kr.hs.dgsw.shop_back.Domain;

import lombok.Data;

@Data
public class Category {

    private Long id;
    private String main_category;
    private String sub_category;
}
