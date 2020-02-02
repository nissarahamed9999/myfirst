package guru.springframework.spring5webapp.model.Repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Publisher;

public interface PublisherRespository extends  CrudRepository<Publisher,Long> {

}
