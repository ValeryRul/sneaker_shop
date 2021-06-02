package sneaker_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sneaker_shop.models.Basket;
import sneaker_shop.models.product.Product;
import sneaker_shop.service.ProductService;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(value = "/basket")
public class BasketController {

    private Basket basket;
    private ProductService productService;

    @Autowired
    public void setBasket(Basket basket) {
        this.basket = basket;
    }
    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String getBasket(Model model){
        List<Product> products = basket.getProducts();
        model.addAttribute("products", products);
        return "product/basket";
    }

    @GetMapping("/add")
    public String addProductToBasket(@RequestParam("article") String article, Model model){
        Product product = productService.getProductById(article);
        List<Product> products = basket.getProducts();
        products.add(product);
        basket.setProducts(products);
        model.addAttribute("products", products);
        return "product/basket";
    }
}
