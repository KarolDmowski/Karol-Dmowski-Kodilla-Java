package challenges;

public interface OrderService {
    boolean createOrder(User user, Product product, int quantity);
}
