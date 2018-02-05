package challenges;

public interface OrderRepository {
    boolean createOrder(User user, Product product, int quantity);
}
