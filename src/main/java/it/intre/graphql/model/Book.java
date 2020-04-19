package it.intre.graphql.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String description;
    Double price;
    @ManyToOne(fetch=FetchType.EAGER, optional = false)
    Author author;
    @Enumerated(EnumType.STRING)
    Genre genre;
    Integer reviews;
    Boolean available;
}
