package tutsviews.lms.domain.media;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import tutsviews.lms.domain.AbstractEntity;
import tutsviews.lms.domain.course.Content;

@Entity
@Data
public class Video extends AbstractEntity {

	
	@NotNull
	private String nameVideo;
	
	@NotNull
	private String urlVideo;
	
	@NotNull
	private String uriVideo;
	
	@NotNull
	private int lengthVideo;
	
	@OneToOne(cascade = { CascadeType. ALL })
	private Content content;
	
	
}
