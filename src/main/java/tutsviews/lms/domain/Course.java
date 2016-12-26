package tutsviews.lms.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Course extends AbstractEntity {

	@NotNull
	private String nameCourse;
	
	@NotNull
	private String titleCourse;
	
	@OneToMany(orphanRemoval = true, cascade = { CascadeType. ALL },mappedBy = "course")
	private List<Category> categories;
	
	@ManyToOne(cascade = { CascadeType. ALL })
	private Author author;
	
	@NotNull
	private boolean isFree;
	
	private String description;
	
	@OneToOne(cascade = { CascadeType. ALL })
	private Image image;
	
	@OneToMany(orphanRemoval = true, cascade = { CascadeType. ALL },mappedBy = "course")
	private List<Section> sections;
	
	@OneToOne(cascade = { CascadeType. ALL })
	private Pricing pricing;
	
	
	
}
