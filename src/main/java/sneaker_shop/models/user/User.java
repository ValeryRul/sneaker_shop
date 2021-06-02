package sneaker_shop.models.user;
import org.springframework.stereotype.Component;
import sneaker_shop.models.Basket;
import sneaker_shop.models.order.Order;
import sneaker_shop.models.product.Sex;
import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private Root root;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orders;
    @OneToOne(mappedBy = "user")
    private Basket basket;
    @Column(name = "email")
    private String email;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "loyalty_points")
    private int points;
    @Column(name = "subscription_discount")
    private boolean subscriptionDiscount;
    private Sex sex;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = Root.getRoot(root);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isSubscriptionDiscount() {
        return subscriptionDiscount;
    }

    public void setSubscriptionDiscount(boolean subscriptionDiscount) {
        this.subscriptionDiscount = subscriptionDiscount;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(String  sex) {
        this.sex = Sex.getSex(sex);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }
}
