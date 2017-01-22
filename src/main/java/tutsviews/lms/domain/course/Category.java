package tutsviews.lms.domain.course;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	private String nameCategory;
	
	@JsonIgnore
	@JoinTable(name="course_category")
	@ManyToMany(cascade = { CascadeType. ALL }, fetch=FetchType.LAZY)
	private List<Course> Courses;
	
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
	

	public List<Course> getCourses() {
		return Courses;
	}

	public void setCourses(List<Course> courses) {
		Courses = courses;
	}

	public Category() {
		super();
	}
	
	
	
}

