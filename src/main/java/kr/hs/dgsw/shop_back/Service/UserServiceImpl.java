package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.User;
import kr.hs.dgsw.shop_back.Domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Long addUser(User user) {
        return this.userMapper.addUser(user);
    }

    @Override
    public User login(User user) {
        return this.userMapper.login(user);
    }

    @Override
    public List<User> findAll() {
        return this.userMapper.findAll();
    }
}
