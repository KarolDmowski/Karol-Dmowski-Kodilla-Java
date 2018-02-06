package Food2Door;

import java.util.List;

public class Supplier {
    private String name;
    private List<Product> productList;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
