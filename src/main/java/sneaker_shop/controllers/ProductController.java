package sneaker_shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sneaker_shop.models.product.Product;
import sneaker_shop.service.ProductService;
import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable ("id") String id, Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "product/product";
    }

    @GetMapping
    public String getProductsList(@RequestParam(value = "sort", required = false) String param, Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product/products";
    }

//    @GetMapping("/{sex}")
//    public ModelAndView getProductBySex(@PathVariable("sex") String sex, HttpServletRequest request){
//        request.getRequestURI()
//        request.getParameterMap();
//    }



//    @PostMapping("/")
//    public void createProduct(@RequestParam("brand") String brand, @RequestParam("model") String model,
//                              @RequestParam("article") String article, @RequestParam("price") int price,
//                              @RequestParam("sex") String sex, @RequestParam("isNew") String isNew,
//                              @RequestParam("quantity") int quantity){
//
//        Product product = new Product(article, Brand.getBrand(brand), model, price,
//                Sex.getSex(sex), Boolean.valueOf(isNew), quantity);
//
//        System.out.println(productService.createOrUpdateProduct(product));
//    }

    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable("id") String id){
        Product product = new Product();
        product.setArticle(id);
        productService.delete(product);
        return "redirect:/product/";
    }

    @PostMapping("/new")
    public String addProduct(@ModelAttribute(value = "product") Product product, Model model){
        product.setNew(true);
        productService.createOrUpdateProduct(product);
        model.addAttribute(product);
        return "product/product";
    }

    @GetMapping("/new")
    public String addProduct(Model model){
        model.addAttribute("product", new Product());
        return "product/new";
    }
}
