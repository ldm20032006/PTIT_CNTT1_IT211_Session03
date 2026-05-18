package org.example.bai5.controller;

import lombok.RequiredArgsConstructor;
import org.example.bai5.entity.Book;
import org.example.bai5.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping
    public ResponseEntity<List<Book>> findAll(@RequestParam(name = "search",defaultValue = "") String search) {
        return ResponseEntity.ok(bookService.findByTitle(search,search));
    }
    @PostMapping
    public ResponseEntity<Book> save(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.save(book));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Long id , @RequestBody Book book) {
        Book book1 =bookService.findById(id);
        if(book1==null){
            return ResponseEntity.notFound().build();
        }
        book1.setTitle(book.getTitle());
        book1.setAuthor(book.getAuthor());
        book1.setYear(book.getYear());
        book1.setAvailable(book.isAvailable());
        return ResponseEntity.ok(bookService.save(book1));
    }
    @GetMapping("{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id) {
        Book book = bookService.findById(id);
        if(book==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        Book book = bookService.findById(id);

        if (book == null) {
            return ResponseEntity.notFound().build();
        }

        bookService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
