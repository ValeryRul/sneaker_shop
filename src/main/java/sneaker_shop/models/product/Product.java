package sneaker_shop.models.product;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "products")
@Table(name = "products")
public class Product {
    @Id
    @Column(name = "id")
    private String article;
    private String brand;
    private String model;
    private int price;
    private String sex;
    @Column(name = "is_new")
    private boolean isNew;
    @Transient
    private int quantityInBasket;
    private LocalDateTime timeOfCreating;

    public Product() {
    }

    {
        setNew(true);
        setTimeOfCreating();
    }

    public Product(String article, String brand, String model, int price,
                   String sex, int quantity) {
        this.article = article;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.sex = sex;
        this.isNew = true;
        this.quantityInBasket = quantity;
        this.timeOfCreating = LocalDateTime.now();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getQuantityInBasket() {
        return quantityInBasket;
    }

    public void setQuantityInBasket(int quantityInBasket){
        this.quantityInBasket = quantityInBasket + getQuantityInBasket();
    }

    public LocalDateTime getTimeOfCreating() {
        return timeOfCreating;
    }

    private void setTimeOfCreating() {
        this.timeOfCreating = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", article='" + article + '\'' +
                ", price=" + price +
                ", sex=" + sex +
                ", isNew=" + isNew +
                '}';
    }
}
