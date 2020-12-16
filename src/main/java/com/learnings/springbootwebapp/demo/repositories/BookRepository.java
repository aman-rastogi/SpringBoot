package com.learnings.springbootwebapp.demo.repositories;

import com.learnings.springbootwebapp.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
