package challenges;

public class OrderRequestRetriver {
    public OrderRequest retrive() {
        User user = new User("John", "Snow");
        Product product = new Product("Something", 123);
        int quantity = 12;

        return new OrderRequest(user, product, quantity);
    }
}
