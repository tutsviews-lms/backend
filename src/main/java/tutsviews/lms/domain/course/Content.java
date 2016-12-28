package tutsviews.lms.domain.course;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.media.Audio;
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.domain.media.Text;
import tutsviews.lms.domain.media.Video;
import tutsviews.lms.domain.util.AbstractEntity;
import tutsviews.lms.domain.util.ContentType;

@Entity
public class Content extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String name;

	@Enumerated(EnumType.STRING)
	private ContentType contentType;

	@ManyToOne(cascade = { CascadeType.ALL })
	private Lecture lecture;
	
	@NotNull
	private int orderContent;
	
	@OneToOne(cascade = { CascadeType.ALL })
	private Image image;
	
	@OneToOne(cascade = { CascadeType.ALL })
	private Video video;
	
	@OneToOne(cascade = { CascadeType.ALL })
	private Audio audio;
	
	
	@OneToOne(cascade = { CascadeType.ALL })
	private Text text;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ContentType getContentType() {
		return contentType;
	}


	public void setContentType(ContentType contentType) {
		this.contentType = contentType;
	}


	public Lecture getLecture() {
		return lecture;
	}


	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}


	public int getOrderContent() {
		return orderContent;
	}


	public void setOrderContent(int orderContent) {
		this.orderContent = orderContent;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public Video getVideo() {
		return video;
	}


	public void setVideo(Video video) {
		this.video = video;
	}


	public Audio getAudio() {
		return audio;
	}


	public void setAudio(Audio audio) {
		this.audio = audio;
	}


	public Text getText() {
		return text;
	}


	public void setText(Text text) {
		this.text = text;
	}


	public Content() {
		super();
	}
	
	
	
	
	

}
