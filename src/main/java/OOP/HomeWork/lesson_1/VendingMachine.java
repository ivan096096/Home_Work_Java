package OOP.HomeWork.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByPrice(Integer price) {
        for (Product product : productList) {
            if (product.getPrice() == price){
                return product;
            }
        }
        return null;
    }

    public VendingMachine() {
        this.productList = new ArrayList<Product>();
    }
}
