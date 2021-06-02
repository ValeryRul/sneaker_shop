package sneaker_shop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sneaker_shop.config.HibernateConfig;
import sneaker_shop.models.brand.Brand;
import sneaker_shop.models.product.Product;

import java.util.List;

@Repository
public class ProductDao implements Dao<Product>{

    @Autowired
    private SessionFactory sessionFactory;


    public boolean createOrUpdate(Product product) {
       Session session = sessionFactory.getCurrentSession();
       session.saveOrUpdate(product);
       return true;
    }

    public Product getById(String id) {
         Session session = sessionFactory.getCurrentSession();
         Product product = session.get(Product.class, id);
         return product;
    }

    public List<Product> getByBrand(String brand) {
        Brand someBrand = Brand.getBrand(brand);
        Session session = sessionFactory.getCurrentSession();
        List<Product> products = session.createQuery("From products where brand = :brand" )
                .setParameter("brand", someBrand).list();
        return products;
    }

    public List<Product> getByModel(String model) {
        Session session = sessionFactory.getCurrentSession();
        List<Product> products = session.createQuery("From products where model = :model" )
                .setParameter("model", model).list();
        return products;
    }


    public List<Product> getAll(){
        Session session = sessionFactory.getCurrentSession();
        List<Product> products = session.createQuery("FROM products").list();
        return products;
    }


    public boolean delete(Product product) {
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()){
            transaction = session.beginTransaction();
            session.delete(product);
            transaction.commit();
            return true;
        }
        catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            return false;
        }
    }
}
