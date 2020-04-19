package it.intre.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import it.intre.graphql.model.Author;
import it.intre.graphql.model.Genre;
import it.intre.graphql.service.AuthorService;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutation implements GraphQLMutationResolver {

    private final AuthorService authorService;

    public AuthorMutation(AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author createAuthor(final String name, final Genre genre) {
        return this.authorService.save(Author.builder()
                .name(name).genre(genre)
                .build());
    }
}
