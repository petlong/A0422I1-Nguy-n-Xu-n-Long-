package codegym.repository;

import codegym.bean.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product product);

    Product findById(String id);

    void update(String id, Product product);

    void remove(String id);

    List<Product> findByName(String name);
}
