package it.intre.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import it.intre.graphql.model.Book;
import it.intre.graphql.service.BookService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookQuery implements GraphQLQueryResolver {

    private final BookService bookService;

    public BookQuery(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getBooks() {
        return this.bookService.findAll();
    }

    public Optional<Book> getBook(final Long id) {
        return this.bookService.findById(id);
    }
}
