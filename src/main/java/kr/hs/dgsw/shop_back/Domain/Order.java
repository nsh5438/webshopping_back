package kr.hs.dgsw.shop_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Order {

    private Long id;
    private Long user_id;
    private Long product_id;
    private int count;
    private int all_total;
    private String pay_way;
    private LocalDateTime order_date;
}
