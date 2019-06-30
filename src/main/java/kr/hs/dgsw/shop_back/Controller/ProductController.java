package kr.hs.dgsw.shop_back.Controller;

import kr.hs.dgsw.shop_back.Domain.Product;
import kr.hs.dgsw.shop_back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getlist/{id}")
    public List<Product> getList(@PathVariable Long id){
        return this.productService.getList(id);
    }

    @GetMapping("/getBestList")
    public List<Product> getBestList() { return this.productService.getBestList(); }

    @GetMapping("/findById/{id}")
    public Product findById(@PathVariable Long id) { return this.productService.findById(id); }
}
