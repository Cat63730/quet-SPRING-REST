package com.bookApiRest.demo.Repository;

import com.bookApiRest.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleOrDescription(String text, String textAgain);
}
