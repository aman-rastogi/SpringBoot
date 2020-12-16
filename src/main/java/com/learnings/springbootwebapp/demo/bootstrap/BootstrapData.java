package com.learnings.springbootwebapp.demo.bootstrap;

import com.learnings.springbootwebapp.demo.domain.Author;
import com.learnings.springbootwebapp.demo.domain.Book;
import com.learnings.springbootwebapp.demo.repositories.AuthorRepository;
import com.learnings.springbootwebapp.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book dd = new Book("Domain Driven Design", "12313");
        eric.getBooks().add(dd);
        dd.getAuthor().add(eric);

        authorRepository.save(eric);
        bookRepository.save(dd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB","123124");
        rod.getBooks().add(noEJB);
        noEJB.getAuthor().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: \t"+bookRepository.count());

    }
}
