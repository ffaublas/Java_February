package com.faublas.bookclub.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faublas.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
