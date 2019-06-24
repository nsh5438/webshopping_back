package kr.hs.dgsw.shop_back.Service;

import kr.hs.dgsw.shop_back.Domain.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getSubCategory(Category category);
}
