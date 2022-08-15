package ss12_map_tree.exercise.use_arraylist_linkedlist;

public class Product {
    private String name;
    private int id;
    private String product;
    private float price;

    public Product(String name, int id, String product, float price) {
        this.name = name;
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
