package kr.hs.dgsw.shop_back.Service;


import kr.hs.dgsw.shop_back.Domain.User;

import java.util.List;


public interface UserService {
    Long addUser(User user);
    User login(User user);
    List<User> findAll();
    String findByAccount(String account);
    int updatePoint(User user);
    int getPoint(Long id);
}
