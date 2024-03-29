package com.pointofsale.dataSupplier.service;

import org.springframework.data.domain.Page;

import com.pointofsale.dataSupplier.dto.request.NewCategoryRequest;
import com.pointofsale.dataSupplier.dto.response.CategoryResponse;
import com.pointofsale.dataSupplier.entity.Category;

public interface CategoryService {
    CategoryResponse saveCategory(NewCategoryRequest request);
    Category getCategoryByCategory(String eCategory);
    Page<CategoryResponse> findAllCategories(String category, Integer page, Integer size);
    CategoryResponse updateCategory(String id, NewCategoryRequest request);
    void deleteCategory(String id);
}
