package tutsviews.lms.domain.course;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.NotBlank;

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

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.domain.enums.DifficultyType;
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Course extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotBlank(message="Le nom ne peut pas être vide.")
	private String nameCourse;
	
	@NotBlank(message="Le titre ne peut pas être vide.")
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


	public Course(String nameCourse, String titleCourse, DifficultyType difficulty, List<Category> categories,
			Author author, String description, Image image, List<Section> sections, boolean free) {
		super();
		this.nameCourse = nameCourse;
		this.titleCourse = titleCourse;
		this.difficulty = difficulty;
		this.categories = categories;
		this.author = author;
		this.description = description;
		this.image = image;
		this.sections = sections;
		this.free = free;
	}


	
	
	
	
	
	
	
	 
}
