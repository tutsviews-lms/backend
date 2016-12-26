package tutsviews.lms.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	private String nameCategory;
	
	@ManyToOne(cascade = { CascadeType. ALL })
	private Course course;
}

