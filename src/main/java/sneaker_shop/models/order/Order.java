package sneaker_shop.models.order;

import sneaker_shop.models.product.Product;
import sneaker_shop.models.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;

@Entity(name = "orders")
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToMany
    @JoinTable(name = "orders_products", joinColumns = @JoinColumn(name = "order_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;
    private OrderStatus status;
    @Column(name = "creating_time")
    private LocalDateTime timeOfCreating;
    public Order() {
    }
}
