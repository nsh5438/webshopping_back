package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Cart;
import kr.hs.dgsw.shop_back.Domain.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartMapper cartMapper;
    @Override
    public int addCart(Cart cart) {
        return this.cartMapper.addCart(cart);
    }

    @Override
    public List<Cart> findById(Long id) {
        return this.cartMapper.findById(id);
    }

    @Override
    public int delete(Long id) {
        return this.cartMapper.delete(id);
    }

    @Override
    public int updateIsOrder(Long id) {
        return this.cartMapper.updateIsOrder(id);
    }

    @Override
    public int updateCount(Cart cart) {
        return this.cartMapper.updateCount(cart);
    }
}
