package kr.hs.dgsw.shop_back.Service;


import kr.hs.dgsw.shop_back.Domain.User;

import java.util.List;


public interface UserService {
    Long addUser(User user);
    User login(User user);
    List<User> findAll();
}
