package tutsviews.lms.domain.media;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.course.Content;
import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Audio extends AbstractEntity {
	
	private static final long serialVersionUID = 1L;

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

	public String getNameAudio() {
		return nameAudio;
	}

	public void setNameAudio(String nameAudio) {
		this.nameAudio = nameAudio;
	}

	public String getUrlAudio() {
		return urlAudio;
	}

	public void setUrlAudio(String urlAudio) {
		this.urlAudio = urlAudio;
	}

	public String getUriAudio() {
		return uriAudio;
	}

	public void setUriAudio(String uriAudio) {
		this.uriAudio = uriAudio;
	}

	public int getLengthAudio() {
		return lengthAudio;
	}

	public void setLengthAudio(int lengthAudio) {
		this.lengthAudio = lengthAudio;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Audio() {
		super();
	}

	
	
}
