package ss17_binary_file.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> product = new ArrayList<>();
        product.add(new Product("1", "Iphone4", 1000));
        product.add(new Product("2", "Iphone5", 2000));
        product.add(new Product("3", "Iphone6", 3000));
        writeFile("productnew.dat", product);
        List<Product> listProduct = (List<Product>) readFile("productnew.dat");
        for (Product p : listProduct) {
            System.out.println(p);
        }
        findProductByName("productnew.dat");
    }

    public static void writeFile(String path, Object o) {
        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(
                             new FileOutputStream(path))) {
            outputStream.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFile(String path) {
        try (ObjectInputStream input =
                     new ObjectInputStream(
                             new FileInputStream(path))) {
            return input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void findProductByName(String path) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = (List<Product>) readFile(path);
        System.out.println("Enter name of product you find: ");
        String searchProduct = scanner.nextLine();
        System.out.println("Product find out: ");
        for(Product p: productList){
            if(p.getName().equals(searchProduct)){
            System.out.println(p);
            break;
            }
            else
                System.out.println("Not found");
        }
    }
}