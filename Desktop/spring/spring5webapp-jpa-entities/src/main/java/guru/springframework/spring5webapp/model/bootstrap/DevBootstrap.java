package guru.springframework.spring5webapp.model.bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.model.Repository.AuthorRespository;
import guru.springframework.spring5webapp.model.Repository.BookRepository;
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	private AuthorRespository authorRepository;	
	private  BookRepository bookRepository;
	public DevBootstrap(AuthorRespository authorRepository,BookRepository bookRepository)
	{
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
		
	}
	private void initData() {
	     //Eric
		Publisher publisher = new Publisher();
		publisher.setName("foo");
        Author eric = new Author("Eric", "Evans");
        Book  ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        	
        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
	
	
	
	}

	
		
	

}
