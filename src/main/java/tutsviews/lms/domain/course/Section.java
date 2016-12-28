package tutsviews.lms.domain.course;

import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Section extends AbstractEntity {

	
	@NotNull
	private String title;
		
	@ManyToOne
	private Course course;
	
	@NotNull
	private int orderSection;
	
	private String description;
	
	@OneToMany(orphanRemoval = true, cascade = { CascadeType. ALL },mappedBy = "section")
	private List<Lecture> lectures;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getOrderSection() {
		return orderSection;
	}

	public void setOrderSection(int orderSection) {
		this.orderSection = orderSection;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}

	public Section() {
		super();
	}
	
	
}
