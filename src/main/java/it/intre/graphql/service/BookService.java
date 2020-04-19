package it.intre.graphql.service;

import it.intre.graphql.model.Book;
import it.intre.graphql.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    public Optional<Book> findById(final Long id) {
        return this.bookRepository.findById(id);
    }

}
