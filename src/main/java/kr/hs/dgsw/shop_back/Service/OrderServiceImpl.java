package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Order;
import kr.hs.dgsw.shop_back.Domain.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderMapper orderMapper;
    @Override
    public int addOrder(Order order) {
        return this.orderMapper.addOrder(order);
    }

    @Override
    public List<Order> findById(Long id) {
        return this.orderMapper.findById(id);
    }
}
