package tutsviews.lms.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

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
