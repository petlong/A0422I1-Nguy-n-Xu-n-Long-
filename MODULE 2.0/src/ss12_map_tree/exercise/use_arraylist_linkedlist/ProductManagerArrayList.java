package ss12_map_tree.exercise.use_arraylist_linkedlist;

import java.util.ArrayList;

public class ProductManagerArrayList {
    private ArrayList<Product> productArrayList = new ArrayList<>();

    public ProductManagerArrayList() {
    }

    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    public void setProduct(int id, Product product) {
        productArrayList.set(id - 1, product);
    }

    public void removeProduct(int id) {
        productArrayList.remove(id - 1);
            }

    public void removeProductByName(String name){
        productArrayList.remove(name);
    }

    public void displayProduct() {
        System.out.println("List product: ");
        System.out.println(productArrayList.toString());

        if (productArrayList.size() == 0) {
            System.out.println("No have product");
        }
    }

    public Product findProductByName(String name) {
        for (Product p : productArrayList) {
            if (p.getName().equals(name))
                return p;
        }
        return null;
    }

    public void sortDecreasePrice() {
        productArrayList.sort((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    }

    public void sortIncreasePrice() {
        productArrayList.sort((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
    }

    public int getSize() {
        return productArrayList.size();
    }
}