package tutsviews.lms.domain.course;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import tutsviews.lms.domain.AbstractEntity;
import tutsviews.lms.domain.util.TypeRecuring;

@Entity
@Data
public class Pricing extends AbstractEntity {

	@NotNull
	private float price;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TypeRecuring typeRecuring;
	
	@OneToOne(orphanRemoval = true, cascade = { CascadeType. ALL })
	private Course course;

}
