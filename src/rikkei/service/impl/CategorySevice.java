package rikkei.service.impl;

import rikkei.entity.Category;
import rikkei.service.ICategory;
import rikkei.service.IGenericIO;

import java.util.ArrayList;
import java.util.List;

public class CategorySevice implements ICategory {
    private List<Category> listCategories = new ArrayList<>();
    @Override
    public List<Category> getAll() {
        return listCategories;
    }

    @Override
    public Category findById(Integer integer) {
        for (Category cat: listCategories) {
            if(cat.getId()==integer){
                return cat;
            }
        }
        return null;
    }

    @Override
    public boolean save(Category category) {
        if(findById(category.getId())==null){
            // id chưa tồn tại , tiene hành thêm mới
            listCategories.add(category);
            return true;
        }else {
            Category cat = findById(category.getId());
//            id  đã tồn tại
            listCategories.set(listCategories.indexOf(cat),category);
            return true;
        }
    }

    @Override
    public boolean delete(Integer integer) {
       if(findById(integer)!=null){
//           cho phép xóa
           listCategories.remove(findById(integer));
           System.out.println("Xóa thành công");
           return true;
       }else {
           System.err.println("Không tìm thấy id");
           return false;
       }
    }

    @Override
    public List<Category> findByName(String name) {
        return null;
    }
}
