package challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new MailServices(), new ProductOrderServices(), new OrderDataBase()){
        };
        orderProcessor.process(orderRequest);
    }
}
