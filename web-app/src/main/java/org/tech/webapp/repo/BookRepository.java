package org.tech.webapp.repo;


import org.springframework.data.repository.CrudRepository;
import org.tech.webapp.model.Book;


public interface BookRepository extends CrudRepository<Book, Long> {
}
