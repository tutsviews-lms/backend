package tutsviews.lms.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Lecture extends AbstractEntity {

	@NotNull
	private String name;
	
	@NotNull
	private int orderLecture;	
	
	@ManyToOne(cascade = { CascadeType. ALL })
	private Section section;
	
	@OneToMany(orphanRemoval = true, cascade = { CascadeType. ALL },mappedBy = "lecture")
	private List<Content> contents;
}
