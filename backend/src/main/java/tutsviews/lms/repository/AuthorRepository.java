package tutsviews.lms.repository;

import java.sql.Timestamp;  
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.author.Author;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

	/**
	 * For DSL we use get/find/counts/read
	 **/
	
	 Long deleteByEmail(String email);
	 Long countByEmail(String email);
	 

	// By FieldName //IS EQUAL NOT

	Author getAuthorByFirstName(String firstName);

	Author getAuthorByFirstNameIs(String firstName);

	Author getAuthorByFirstNameEquals(String firstName);

	List<Author> getAuthorsByFirstNameNot(String firstName);
	
	List<Author> getByAddressState(String state);

	List<Author> getAuthorsByFirstName(String firstName);

	List<Author> getAuthorsByFirstNameIs(String firstName);

	List<Author> getAuthorsByFirstNameEquals(String firstName);

	// LIKE {%} // StartingWith EndingWith Containing no {%}

	List<Author> getAuthorsByFirstNameLike(String firstName);

	List<Author> getAuthorsByFirstNameStartingWith(String firstName);

	List<Author> getAuthorsByFirstNameEndingWith(String firstName);

	List<Author> getAuthorsByFirstNameContaining(String firstName);

	List<Author> findAuthorsByFirstNameLike(String firstName);

	// AND OR
	List<Author> findAuthorsByFirstNameOrLastNameOrEmail(String firstName, String lastName, String email);

	List<Author> findAuthorsByEmailAndTel(String email, String tel);

	// GreaterThan > , GreaterThanEqual >= , LessThan < , LessThanEqual <=

	// 2 fields
	List<Author> findAuthorsByTelGreaterThanEqualAndEmailGreaterThanEqual(String tel, String email);

	// Before Date
	List<Author> findByCreatedAtBefore(Timestamp date);

	// IgnoreCase "X" == where UPPER(i.nomImage) like UPPER (?X%) ==where
	// UPPER(i.nomImage) =UPPER (?X)
	List<Author> findAuthorsByFirstNameStartingWithIgnoreCase(String firstName);

	// ASC DESC OrderByFiledAsc
	List<Author> findAuthorsByFirstNameStartingWithIgnoreCaseOrderByIdAsc(String firstName);

	// First, Top5 Top10, DistinctQuestion
	List<Author> findTop5AuthorsByFirstNameStartingWithIgnoreCaseOrderByEmailDesc(String firstName);

	// no repetition for the collection of questions
	List<Author> findTop5DistinctAuthorsByFirstNameStartingWithIgnoreCaseOrderByEmailAsc(String firstName);

	// Page

	Page<Author> findAll(Pageable pageable);

	Page<Author> findByFirstNameContainingAndLastNameContainingAllIgnoringCase(String name, String country, Pageable pageable);

}
