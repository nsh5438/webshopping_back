package kr.hs.dgsw.shop_back.Domain;

import lombok.Data;

@Data
public class Cart {

    private Long id;
    private Long user_id;
    private Long product_id;
    private int count;
    private String is_order;
}
