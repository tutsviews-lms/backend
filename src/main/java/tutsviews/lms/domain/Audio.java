package tutsviews.lms.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

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
