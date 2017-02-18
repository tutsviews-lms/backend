package tutsviews.lms.domain.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Category {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	private String nameCategory;
	
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
	
	public Category() {
		super();
	}
	
	
	
}

