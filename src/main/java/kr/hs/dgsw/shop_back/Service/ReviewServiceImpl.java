package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Review;
import kr.hs.dgsw.shop_back.Domain.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService  {

    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public List<Review> getReview(Long id) {
        return this.reviewMapper.getReview(id);
    }

    @Override
    public int addReview(Review review) {
        return this.reviewMapper.addReview(review);
    }
}
