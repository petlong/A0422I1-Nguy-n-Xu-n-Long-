package codegym.repository;

import codegym.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository{
private static Map<String,Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put("P001", new Product("P001", "iphone 4", 100, "apple", "produced in 2014"));
        productMap.put("P002", new Product("P002", "iphone 5", 200, "apple", "produced in 2015"));
        productMap.put("P003", new Product("P003", "iphone 6", 300, "apple", "produced in 2016"));
        productMap.put("P004", new Product("P004", "iphone 7", 400, "apple", "produced in 2017"));
        productMap.put("P005", new Product("P005", "iphone 8", 500, "apple", "produced in 2018"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public void update(String id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(String id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        if (name.equals("")) {
            return findAll();
        } else {
            List<Product> resultProduct = new ArrayList<>();
            for (Product p : productMap.values()) {
                if (p.getName().contains(name)) {
                    resultProduct.add(p);
                }
            }
            return resultProduct;
        }
    }
}
