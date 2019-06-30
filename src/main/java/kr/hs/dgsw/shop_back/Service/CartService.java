package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Cart;

import java.util.List;

public interface CartService {
    int addCart(Cart cart);
    List<Cart> findById(Long id);
    int delete(Long id);
    int updateIsOrder(Long id);
    int updateCount (Cart cart);
}
