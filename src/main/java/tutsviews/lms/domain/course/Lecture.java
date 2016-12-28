package tutsviews.lms.domain.course;

import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Lecture extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String name;
	
	@NotNull
	private int orderLecture;	
	
	@ManyToOne(cascade = { CascadeType. ALL })
	private Section section;
	
	@OneToMany(orphanRemoval = true, cascade = { CascadeType. ALL },mappedBy = "lecture")
	private List<Content> contents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrderLecture() {
		return orderLecture;
	}

	public void setOrderLecture(int orderLecture) {
		this.orderLecture = orderLecture;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public Lecture() {
		super();
	}
	
	
	
	
}
