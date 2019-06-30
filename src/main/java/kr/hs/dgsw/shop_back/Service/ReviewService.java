package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getReview(Long id);

    int addReview(Review review);
}
