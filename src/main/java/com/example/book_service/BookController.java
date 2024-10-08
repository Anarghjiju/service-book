package com.example.book_service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepo br;

    @GetMapping("/books/{bid}")
    public BookEntity getABook(@PathVariable("bid") Long bookId){
        return br.findById(bookId).get();
    }
    @GetMapping("/books")
    public List<BookEntity> getAllBooks(){
        return br.findAll();
    }
    @PostMapping("/books")
    public BookEntity addABook(BookEntity newBook){
        return br.saveAndFlush(newBook);
    }

}
