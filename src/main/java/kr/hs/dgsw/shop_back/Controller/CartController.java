package kr.hs.dgsw.shop_back.Controller;

import kr.hs.dgsw.shop_back.Domain.Cart;
import kr.hs.dgsw.shop_back.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "*")
public class CartController {

    @Autowired
    CartService cartService;

    @PostMapping(value = "/addCart")
    public int addCart(@RequestBody Cart cart){
        return this.cartService.addCart(cart);
    }

    @GetMapping(value = "/findById/{id}")
    public List<Cart> findById(@PathVariable Long id){
        return this.cartService.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public int delete(@PathVariable Long id){
        return this.cartService.delete(id);
    }

    @PutMapping(value = "/updateIsOrder/{id}")
    public int updateIsOrder(@PathVariable Long id) { return this.cartService.updateIsOrder(id);}

    @PutMapping(value = "/updateCount")
    public int updateCount(@RequestBody Cart cart) {return this.cartService.updateCount(cart);}
}
