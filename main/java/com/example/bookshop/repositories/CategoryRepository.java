package com.example.bookshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookshop.models.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
