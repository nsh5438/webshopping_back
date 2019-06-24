package kr.hs.dgsw.shop_back.Controller;

import kr.hs.dgsw.shop_back.Domain.Category;
import kr.hs.dgsw.shop_back.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/getSubCategory")
    public List<Category> getSubCategory(@RequestBody Category category){
        return this.categoryService.getSubCategory(category);
    }

}
