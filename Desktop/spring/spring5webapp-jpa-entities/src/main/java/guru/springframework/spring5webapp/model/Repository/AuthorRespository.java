package guru.springframework.spring5webapp.model.Repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Author;

public interface AuthorRespository extends CrudRepository<Author, Long> {
	

}
