package ss17_binary_file.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Serializable {
    private List<Product> productArrayList = new ArrayList<>();

    public ProductManager() {
    }

    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    public void setProduct(int id,Product product) {
        productArrayList.set(id - 1, product);
    }

    public void removeProductById(int id) {
        productArrayList.remove(id - 1);
            }

    public void removeProductByName(String name){
        productArrayList.remove(findProductByName(name));
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

//    public static Object readFile(String path) {
//        try (ObjectInputStream input =
//                     new ObjectInputStream(
//                             new FileInputStream(path))) {
//            return input.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
    }

//    public static void writeFile(String path, Object o) {
//        try (ObjectOutputStream outputStream =
//                     new ObjectOutputStream(
//                             new FileOutputStream(path))) {
//            outputStream.writeObject(o);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
