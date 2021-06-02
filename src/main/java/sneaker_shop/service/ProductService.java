package sneaker_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sneaker_shop.dao.ProductDao;
import sneaker_shop.models.product.Product;
import sneaker_shop.models.product.SortingParameter;

import java.util.List;

@Service
public class ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Transactional
    public boolean createOrUpdateProduct(Product product){
        return productDao.createOrUpdate(product);
    }

    @Transactional
    public Product getProductById(String productId){
        return productDao.getById(productId);
    }

    public List<Product> getProductsByBrand(String brand){
        return productDao.getByBrand(brand);
    }

    public List<Product> getProductsByModel(String model){
        return productDao.getByModel(model);
    }

    @Transactional
    public List<Product> getAllProducts(){
        return productDao.getAll();
    }

    @Transactional
    public boolean delete(Product product){
        return productDao.delete(product);
    }

//    public List<Product> getProductByParameter(String param){
//        if(param == null) return getAllProducts();
//
//        if(Brand.){
//             return getProductsByBrand()
//        }
//
//        return getProductsByModel(param);
//    }

    public List<Product> getProductSortedList(String param) {
        List<Product> productsByPrice = getAllProducts();
        SortingParameter parameter = SortingParameter.getSortingParameter(param);
        for (SortingParameter sortingParameter : SortingParameter.values()) {
            switch (parameter) {
                case PRICE_LOW_TO_HIGH:
                    productsByPrice.sort((o1, o2) -> o1.getPrice() - o2.getPrice());
                    break;
                case PRICE_HIGH_TO_LOW:
                    productsByPrice.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
                    break;
                //TODO
                case NEW_TO_OLD:
//create field Date of creating for Product
                    //TODO
                case OLD_TO_NEW:
//create field Date of creating for Product
                default:
                    //return sort new_to_old
            }
        }
        return productsByPrice;
    }
}
