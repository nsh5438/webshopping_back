package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Category;
import kr.hs.dgsw.shop_back.Domain.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> getSubCategory(Category category) {
        return this.categoryMapper.getSubCategory(category);
    }
}
