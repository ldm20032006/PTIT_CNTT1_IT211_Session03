package org.example.bai5.service;

import lombok.RequiredArgsConstructor;
import org.example.bai5.entity.Book;
import org.example.bai5.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public List<Book> findByTitle(String title, String author) {
        return bookRepository.findByTitleOrAuthor(title,author);
    }
    public Book save(Book book) {
        return bookRepository.save(book);
    }
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
