package sneaker_shop.dao;

import sneaker_shop.models.product.Product;

public interface Dao<T> {

    T getById(String id);

    boolean createOrUpdate(T o);

    boolean delete(T o);
}

