package kr.hs.dgsw.shop_back.Domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
    List<Review> getReview(Long id);
    int addReview(Review review);
}
