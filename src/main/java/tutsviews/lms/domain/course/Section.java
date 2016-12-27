package tutsviews.lms.domain.course;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Data;
import tutsviews.lms.domain.AbstractEntity;

@Entity
@Data
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
	
	
}
