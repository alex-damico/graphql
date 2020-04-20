insert into author (id, name) values (1, 'Leo Tolstoy');
insert into book (id, title, author_id, genre, description, available, reviews, price)
values (2, 'War and Peace', 1, 'NOVEL', 'The novel chronicles the history of the French invasion of Russia and the impact of the Napoleonic era on Tsarist society through the stories of five Russian aristocratic families.', true, 5, 12);
insert into book (id, title, author_id, genre, description, available, reviews, price)
values (3, 'Anna Karenina', 1, 'NOVEL', 'A complex novel in eight parts, with more than a dozen major characters, it is spread over more than 800 pages (depending on the translation), typically contained in two volumes.', false, 2, 10);

insert into author (id, name) values (4, 'Anton Chekhov');
insert into book (id, title, author_id, genre, description, available, reviews, price)
values (5, 'The Cherry Orchard', 4, 'PLAY', 'The play concerns an aristocratic Russian landowner who returns to her family estate (which includes a large and well-known cherry orchard) just before it is auctioned to pay the mortgage.', true, 1, 2);
insert into book (id, title, author_id, genre, description, available, reviews, price)
values (6, 'The Seagull', 4, 'PLAY', 'It dramatises the romantic and artistic conflicts between four characters', false, 5, 15);

insert into author (id, name) values (8, 'Igor Dianov');