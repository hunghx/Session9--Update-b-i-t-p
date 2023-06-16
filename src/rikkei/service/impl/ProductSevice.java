package rikkei.service.impl;

import rikkei.entity.Product;
import rikkei.service.IProduct;

import java.util.List;

public class ProductSevice implements IProduct {
    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product findById(Integer integer) {
        return null;
    }

    @Override
    public boolean save(Product product) {
        return false;
    }

    @Override
    public boolean delete(Integer integer) {
        return false;
    }
}
