package org.tech.webapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.tech.webapp.model.Author;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
