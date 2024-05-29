package com.example.shoppappspring.services;

import com.example.shoppappspring.dtos.CategoryDTO;
import com.example.shoppappspring.models.Category;

import java.util.List;
public interface ICategoryService {
    Category createCategory(CategoryDTO categoryDTO);

    Category getCategoryById(long id);

    List<Category> getAllCategories();

    Category updateCategory(long categoryId, CategoryDTO categoryDTO);

    void deleteCategory(long id);
}
