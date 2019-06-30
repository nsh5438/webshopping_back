package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Order;

import java.util.List;

public interface OrderService {

    int addOrder(Order order);
    List<Order> findById(Long id);
}
