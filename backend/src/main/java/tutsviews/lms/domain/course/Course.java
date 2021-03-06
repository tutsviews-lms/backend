package tutsviews.lms.domain.course;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.domain.util.AbstractEntity;
import tutsviews.lms.domain.util.DifficultyType;

@Entity
public class Course extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String nameCourse;
	
	@NotBlank
	private String titleCourse;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private DifficultyType difficulty;
	
	@JoinTable(name="course_category")
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Category> categories;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private Author author;
	
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Image image;
	
	@OneToMany( cascade = CascadeType.ALL,mappedBy = "course", fetch=FetchType.LAZY)
	private List<Section> sections;
	
	@NotNull
	private boolean free;
	
	public Course() {
		super();
	}
	

	public boolean isFree() {
		return free;
	}


	public void setFree(boolean free) {
		this.free = free;
	}



	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getTitleCourse() {
		return titleCourse;
	}

	public void setTitleCourse(String titleCourse) {
		this.titleCourse = titleCourse;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public DifficultyType getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(DifficultyType difficulty) {
		this.difficulty = difficulty;
	}


	
	
	
	
	
	
	
}
