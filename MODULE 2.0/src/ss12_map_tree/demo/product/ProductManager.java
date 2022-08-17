package ss12_map_tree.demo.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ProductManager {
    private ArrayList<Product> productList = new ArrayList();

    public ProductManager() {
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void modifyProduct(int id, Product product) {
        productList.set(id - 1, product);
    }

    public void removeProduct(int id) {
        productList.remove(id - 1);
    }

    public int indexOfProduct(String productName) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(productName))
                return i + 1;
        }
        return -1;
    }

    public int getSize() {
        return productList.size();
    }

    public void display() {
        int id = 0;
        System.out.println("Display All Product: ");
        for (Product product : productList) {
            product.setId(++id);
            System.out.println(product.toString());
        }
        if (productList.size() == 0)
            System.out.println("\tNo products");
    }

    public void sortIncrease() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    public void sortDecrease() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
    }
}
