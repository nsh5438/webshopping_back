package kr.hs.dgsw.shop_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> getList(Long id);
    Product findById(Long id);
    List<Product> getBestList();

}
