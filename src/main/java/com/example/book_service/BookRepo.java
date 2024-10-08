package com.example.book_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo  extends JpaRepository<BookEntity,Long> {
}
