package tutsviews.lms.domain.course;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Category {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	private String nameCategory;
	
	@ManyToOne(cascade = { CascadeType. ALL })
	private Course course;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Category() {
		super();
	}
	
	
	
}

