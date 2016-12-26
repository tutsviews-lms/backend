package tutsviews.lms.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Author;
import tutsviews.lms.repository.AuthorRepository;


@Repository
public class AuthorRepositoryImpl {
	
	@Autowired
	AuthorRepository authorRepository;
	
	public List<Author> getAll(){
		return authorRepository.findAll();
	}
	
	
	public Author getOne(Long id){
		return authorRepository.findOne(id);
	}
	
	
	
	

}
