package shop.mtcoding.orange2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import shop.mtcoding.orange2.model.Product;
import shop.mtcoding.orange2.model.ProductRepository;

// https://mybatis.org/mybatis-3/ko/sqlmap-xml.html
@Controller
public class ProductController {

    @Autowired // Type으로 찾아냄
    private ProductRepository productRepository;

    @GetMapping("/product")
    public String findAllProduct(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);
        return "main"; // request 새로 만들어짐 -> 덮어쒸움. (프레임워크)
    }

    // 이거 완성해보세요. detail.jsp 만들어서!!
    @GetMapping("/product/{id}")
    public String findOneProduct(@PathVariable int id, Model model) {
        Product product = productRepository.findOne(id);

        return "detail";
    }
}
