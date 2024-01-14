package com.example.bookshop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookshop.models.Book;
import com.example.bookshop.models.Review;


public interface ReviewRepository extends JpaRepository<Review, Long>{
	List<Review> findAllByBook(Book book);
}
