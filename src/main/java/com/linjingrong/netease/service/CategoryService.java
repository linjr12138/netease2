
package com.linjingrong.netease.service;


import java.util.List;

import com.linjingrong.netease.pojo.Category;

public interface CategoryService{
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}
