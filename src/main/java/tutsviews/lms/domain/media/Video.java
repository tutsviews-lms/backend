package tutsviews.lms.domain.media;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Video extends AbstractEntity {

	private static final long serialVersionUID = -5934226397177425890L;

	@NotNull
	private String nameVideo;
	
	@NotNull
	private String urlVideo;
	
	@NotNull
	private String uriVideo;
	
	@NotNull
	private int lengthVideo;
	

	public String getNameVideo() {
		return nameVideo;
	}

	public void setNameVideo(String nameVideo) {
		this.nameVideo = nameVideo;
	}

	public String getUrlVideo() {
		return urlVideo;
	}

	public void setUrlVideo(String urlVideo) {
		this.urlVideo = urlVideo;
	}

	public String getUriVideo() {
		return uriVideo;
	}

	public void setUriVideo(String uriVideo) {
		this.uriVideo = uriVideo;
	}

	public int getLengthVideo() {
		return lengthVideo;
	}

	public void setLengthVideo(int lengthVideo) {
		this.lengthVideo = lengthVideo;
	}


	public Video() {

	}
	
	
	
	
}
