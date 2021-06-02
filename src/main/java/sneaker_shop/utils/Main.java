package sneaker_shop.utils;

import org.springframework.beans.factory.annotation.Autowired;
import sneaker_shop.dao.ProductDao;
import sneaker_shop.dao.UserDao;
import sneaker_shop.models.brand.Brand;
import sneaker_shop.models.product.Product;
import sneaker_shop.models.product.Sex;
import sneaker_shop.models.user.User;
import sneaker_shop.service.ProductService;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        System.out.println(userDao.findUserByPasswordAndLogin("pratatupi@gmail.com", "5468776a"));


//        ProductDao productDao = new ProductDao();
//        productDao.createOrUpdate(new Product("100-10000", "Nike", "Air Max", 300, "man", 0));
//        System.out.println(productDao.getAll());
    }
}
