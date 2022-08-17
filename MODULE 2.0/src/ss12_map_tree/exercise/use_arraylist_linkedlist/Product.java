package ss12_map_tree.exercise.use_arraylist_linkedlist;

public class Product {
    private int id;
    private String name;
    private float price;

    public Product(){}

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
        return "Id:" + id +"; Name Product:" + name + "; Price:" + price+ "$";
    }
}
