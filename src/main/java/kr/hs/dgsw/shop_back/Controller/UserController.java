package kr.hs.dgsw.shop_back.Controller;

import kr.hs.dgsw.shop_back.Domain.User;
import kr.hs.dgsw.shop_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/list")
    public List users(){
        return this.userService.findAll();
    }

    @PostMapping(value = "/login")
    public User login(@RequestBody User user) { return this.userService.login(user); }

    @PostMapping(value = "/add")
    public Long add(@RequestBody User user){
        return this.userService.addUser(user);
    }

}
