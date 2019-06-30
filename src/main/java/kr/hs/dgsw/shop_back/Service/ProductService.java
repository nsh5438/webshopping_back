package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> getList(Long id);

    Product findById(Long id);

    List<Product> getBestList();
}
