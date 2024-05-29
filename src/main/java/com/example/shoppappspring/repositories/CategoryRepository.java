package com.example.shoppappspring.repositories;

import com.example.shoppappspring.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
