package kr.hs.dgsw.shop_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    private Long id;
    private String account;
    private String password;
    private String username;
    private String phone;
    private String mobile;
    private String postal_code;
    private String address;
    private String email;
    private Long point;
    private LocalDateTime created;
    private LocalDateTime updated;
}
