package tutsviews.lms.domain.media;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import tutsviews.lms.domain.AbstractEntity;
import tutsviews.lms.domain.course.Content;

@Entity
@Data
public class Text extends AbstractEntity {

	@NotNull
	private Text htmlText;  
	
	@NotNull
	private Text simpleText;
	
	@OneToOne
	private Content content;
	
}
