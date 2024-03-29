package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "iphone 4", 100, "apple", "produced in 2014"));
        products.put(2, new Product(2, "iphone 5", 200, "apple", "produced in 2015"));
        products.put(3, new Product(3, "iphone 6", 300, "apple", "produced in 2016"));
        products.put(4, new Product(4, "iphone 7", 400, "apple", "produced in 2017"));
        products.put(5, new Product(5, "iphone 8", 500, "apple", "produced in 2018"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> resultProduct = new ArrayList<>();
        for(Product p: products.values()) {
            if(p.getName().contains(name)) {
                resultProduct.add(p);
            }
        }
        return resultProduct;
    }
}