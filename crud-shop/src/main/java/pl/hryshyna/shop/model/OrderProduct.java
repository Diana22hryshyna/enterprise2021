package pl.hryshyna.shop.model;
import pl.hryshyna.shop.model.Product;
import pl.hryshyna.shop.model.Order;
import javax.persistence.*;

@Entity
public class OrderProduct {
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(nullable = false)
    private Integer quantity;
    @Id
    private String id;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    // default constructor

    public OrderProduct(Order order, Product product, Integer quantity) {
        setOrder(order);
        setProduct(product);
        this.quantity = quantity;
    }

    @Transient
    public Product getProduct() {
        return getProduct();
    }

    @Transient
    public Double getTotalPrice() {
        return getProduct().getPrice() * getQuantity();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // standard getters and setters

    // hashcode() and equals() methods
}