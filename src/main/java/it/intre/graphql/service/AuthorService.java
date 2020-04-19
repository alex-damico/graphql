package it.intre.graphql.service;

import it.intre.graphql.model.Author;
import it.intre.graphql.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> findAll() {
        return this.authorRepository.findAll();
    }

    public Optional<Author> findById(final Long id) {
        return this.authorRepository.findById(id);
    }

    public Author save(Author author) {
        return this.authorRepository.save(author);
    }
}
