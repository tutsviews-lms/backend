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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tutsviews.lms.domain.course.Course;
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Author extends AbstractEntity {

	
	private static final long serialVersionUID = 1L;

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

	@OneToMany(mappedBy = "author")
	private List<Course> courses;

	@OneToOne(cascade = CascadeType.ALL)
	private Image image;

	public Author() {
		super();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	
	

	
	
	
	
	
	
}
