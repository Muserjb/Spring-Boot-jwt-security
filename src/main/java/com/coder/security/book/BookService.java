package com.coder.security.book;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository repository;
    public void save(BookRequest request) {
        var book = Book.builder()
               .id(request.getId())
                .author(request.getAuthor())
                .isbn(request.getIsbn())
                .build();
            repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }
}
