package sneaker_shop.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import sneaker_shop.models.product.Product;
import sneaker_shop.models.user.User;

public class HibernateUtil {

    static SessionFactory sessionFactory;


    /**
     * Return new session to work by using hibernate
     * @return org.hibernate.Session
     */
    public static SessionFactory getSessionFactory() {

        if(sessionFactory != null && !sessionFactory.isClosed())
            return sessionFactory;

        try {
            Configuration configuration = new Configuration();

            configuration.addAnnotatedClass(Product.class);
            configuration.addAnnotatedClass(User.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable e) {
            System.err.println("Failed to create sessionFactory object." + e);
            throw new ExceptionInInitializerError(e);
        }
        return sessionFactory;
    }
}