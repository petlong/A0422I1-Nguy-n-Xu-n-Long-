package ss12_map_tree.exercise.use_arraylist_linkedlist;

import java.util.Scanner;

public class ProductManagerArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagerArrayList product = new ProductManagerArrayList();
        product.addProduct(new Product(1, "Iphone4", 1000));
        product.addProduct(new Product(2, "Iphone5", 2000));
        product.addProduct(new Product(3, "Iphone6", 3000));
        product.displayProduct();
        product.removeProductByName("Iphone4");
        product.displayProduct();
        displayChoice();
        int choice;
        do {
            System.out.print("Enter your option: ");
            choice = scanner.nextInt();
            int id;
            String nameOfProduct;
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    product.addProduct(addProductList());
                    break;
                case 2:
//                    product.displayProduct();
                    do {
                        System.out.print("Enter the id to set: ");
                        id = scanner.nextInt();
                        if (id > product.getSize())
                            System.out.println("Please enter id not more " + product.getSize());
                    }
                    while (id > product.getSize());
                    product.setProduct(id,setProductList(id));
                    break;
                case 3:
                    product.displayProduct();
                    System.out.print("Enter the id to remove: ");
                    id = scanner.nextInt();
                    product.removeProductById(id);
                    break;
                case 4:
                    product.displayProduct();
                    break;
                case 5:
//                    scanner.nextLine();
                    System.out.print("Enter name of product to search: ");
                    nameOfProduct = scanner.nextLine();
                    if (product.findProductByName(nameOfProduct)==null)
                        System.out.println("No product which you want to search.");
                    else
                        System.out.println("Product which you want to search: " + product.findProductByName(nameOfProduct));
                    break;
                case 6:
                    product.sortIncreasePrice();
                    product.displayProduct();
                    break;
                case 7:
                    product.sortDecreasePrice();
                    product.displayProduct();
                    break;
                case 8:
                    displayChoice();
                    break;
                default:
                    System.out.println("Please enter a number between 0 and 8");
                    break;
            }
        }
        while (choice != 0);
    }
    public static void displayChoice() {
        System.out.println("Choice: ");
        System.out.println("\t1.Add product");
        System.out.println("\t2.Set product");
        System.out.println("\t3.Remove product");
        System.out.println("\t4.Display product");
        System.out.println("\t5.Find product");
        System.out.println("\t6.Sort product increase by price");
        System.out.println("\t7.Sort product decrease by price");
        System.out.println("\t8.Display options");
        System.out.println("\t0.Exit");
    }

    public static int enterIdProduct(){
        Scanner inputId = new Scanner (System.in);
        System.out.println("Enter id of product");
        int id = inputId.nextInt();
        return id;
    }

    public static String enterNameProduct(){
        Scanner inputName = new Scanner (System.in);
        System.out.println("Enter name of product");
        String name = inputName.nextLine();
        return name;
    }

    public static long enterPriceProduct(){
        Scanner inputPrice= new Scanner (System.in);
        System.out.println("Enter price of product");
        long price = inputPrice.nextInt();
        return price;
    }

    public static Product addProductList() {
        int id = enterIdProduct();
        String name = enterNameProduct();
        long price = enterPriceProduct();
        return new Product(id,name,price);
    }
    public static Product setProductList(int id) {
        String name = enterNameProduct();
        long price = enterPriceProduct();
        return new Product(id,name,price);
    }
}