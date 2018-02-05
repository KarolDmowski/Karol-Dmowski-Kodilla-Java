package challenges;

public class OrderDto {

    private User user;
    private Product product;
    private int productQuantity;
    private boolean isOrdered;

    public OrderDto(User user, Product product, int productQuantity, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.productQuantity = productQuantity;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
