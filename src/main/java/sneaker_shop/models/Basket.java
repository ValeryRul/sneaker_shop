package sneaker_shop.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import sneaker_shop.models.product.Product;
import sneaker_shop.models.user.User;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "baskets")
@Table(name = "baskets")
@Component
@SessionScope
public class Basket {
    @Id
    private int id;
    private int price;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "basket_product", joinColumns = @JoinColumn(name = "basket_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Basket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
