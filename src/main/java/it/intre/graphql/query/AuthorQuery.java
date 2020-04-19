package it.intre.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import it.intre.graphql.model.Author;
import it.intre.graphql.service.AuthorService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AuthorQuery implements GraphQLQueryResolver {

    private final AuthorService authorService;

    public AuthorQuery(AuthorService authorService) {
        this.authorService = authorService;
    }

    public List<Author> getAuthors() {
        return this.authorService.findAll();
    }

    public Optional<Author> getAuthor(final Long id) {
        return this.authorService.findById(id);
    }
}
