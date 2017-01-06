package tutsviews.lms.domain.course;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tutsviews.lms.domain.util.AbstractEntity;
import tutsviews.lms.domain.util.TypeRecuring;

@Entity
public class Pricing extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private float price;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TypeRecuring typeRecuring;
	
	@JsonIgnore
	@OneToOne(cascade = { CascadeType. ALL })
	private Course course;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public TypeRecuring getTypeRecuring() {
		return typeRecuring;
	}

	public void setTypeRecuring(TypeRecuring typeRecuring) {
		this.typeRecuring = typeRecuring;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Pricing() {
		super();
	}

	
	
	
}
