package rikkei.service;

import rikkei.entity.Category;

import java.util.List;

public interface ICategory extends IGenericIO<Category,Integer>{
    // phát triển , mở rộng tính năng cho lớp Category
    // tìm kiếm theo tên
    List<Category> findByName(String name);
}
