package com.mauriciocoruja.SpringProjetc.repositories;

import com.mauriciocoruja.SpringProjetc.entities.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private Map<Long, Product> map = new HashMap<>();

    public void save(Product obj) {
        map.put(obj.getId(), obj);
    }

    public Product findById(Long id) {
        return map.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }
}
