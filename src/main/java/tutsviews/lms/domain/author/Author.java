package tutsviews.lms.domain.author;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import lombok.Data;
import tutsviews.lms.domain.AbstractEntity;
import tutsviews.lms.domain.course.Course;
import tutsviews.lms.domain.media.Image;

@Data
@Entity
public class Author extends AbstractEntity {

	@NotNull
	private String lastName;

	@NotNull
	private String firstName;

	@Column(length = 5000)
	private String description;

	@Email
	@NotNull
	private String email;

	@NotNull
	private String password;

	@Embedded
	private Address address;

	@NotNull
	private String tel;

	@OneToMany(orphanRemoval = true, cascade = { CascadeType.ALL },mappedBy = "author")
	private List<Course> courses;

	@OneToOne(orphanRemoval = true, cascade = { CascadeType.ALL })
	private Image image;

}
