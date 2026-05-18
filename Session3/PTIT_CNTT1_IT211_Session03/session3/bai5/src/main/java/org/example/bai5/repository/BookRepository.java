package org.example.bai5.repository;

import org.example.bai5.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    @Query("select b from Book b where b.title LIKE %:title% or b.author like %:author%")
    List<Book> findByTitleOrAuthor(@Param("title") String title, @Param("author") String author);
}
