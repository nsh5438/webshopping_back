package kr.hs.dgsw.shop_back.Controller;

import kr.hs.dgsw.shop_back.Domain.Cart;
import kr.hs.dgsw.shop_back.Domain.Order;
import kr.hs.dgsw.shop_back.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(value = "/addOrder")
    public int addOrder(@RequestBody Order order){
        return this.orderService.addOrder(order);
    }

    @GetMapping(value = "/findById/{id}")
    public List<Order> findById(@PathVariable Long id){
        return this.orderService.findById(id);
    }



}
