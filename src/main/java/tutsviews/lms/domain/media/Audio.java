package tutsviews.lms.domain.media;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import tutsviews.lms.domain.AbstractEntity;
import tutsviews.lms.domain.course.Content;

@Data
@Entity
public class Audio extends AbstractEntity {
	
	@NotNull
	private String nameAudio;
	
	@NotNull
	private String urlAudio;
	
	@NotNull
	private String uriAudio;
	
	@NotNull
	private int lengthAudio;
	
	@OneToOne(cascade = { CascadeType. ALL })
	private Content content;

}
