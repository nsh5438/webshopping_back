package kr.hs.dgsw.shop_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    int addOrder(Order order);
    List<Order> findById(Long id);
}
