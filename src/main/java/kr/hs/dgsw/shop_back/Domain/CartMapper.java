package kr.hs.dgsw.shop_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    int addCart(Cart cart);
    List<Cart> findById(Long id);
    int delete(Long id);
    int updateIsOrder(Long id);
    int updateCount(Cart cart);
}
