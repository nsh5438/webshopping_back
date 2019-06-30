package kr.hs.dgsw.shop_back.Controller;

import kr.hs.dgsw.shop_back.Domain.Category;
import kr.hs.dgsw.shop_back.Domain.Review;
import kr.hs.dgsw.shop_back.Service.CategoryService;
import kr.hs.dgsw.shop_back.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@CrossOrigin(origins = "*")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @GetMapping("/getReview/{id}")
    public List<Review> getReview(@PathVariable Long id){
        return this.reviewService.getReview(id);
    }

    @PostMapping("/addReview")
    public int addReview(@RequestBody Review review){
        return this.reviewService.addReview(review);
    }

}
