package sneaker_shop.dao;

import sneaker_shop.models.Basket;

public class BasketDao implements Dao<Basket> {
    @Override
    public Basket getById(String id) {
        return null;
    }

    @Override
    public boolean createOrUpdate(Basket o) {
        return false;
    }

    @Override
    public boolean delete(Basket o) {
        return false;
    }
}
