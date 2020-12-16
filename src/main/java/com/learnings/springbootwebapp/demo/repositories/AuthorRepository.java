package com.learnings.springbootwebapp.demo.repositories;

import com.learnings.springbootwebapp.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
