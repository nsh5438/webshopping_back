package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Product;
import kr.hs.dgsw.shop_back.Domain.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> getList(Long id) {
        return this.productMapper.getList(id);
    }
}
