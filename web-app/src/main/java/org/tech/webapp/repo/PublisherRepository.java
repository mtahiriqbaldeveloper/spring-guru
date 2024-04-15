package org.tech.webapp.repo;


import org.springframework.data.repository.CrudRepository;
import org.tech.webapp.model.Publisher;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
