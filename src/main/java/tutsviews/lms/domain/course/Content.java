package tutsviews.lms.domain.course;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;
import tutsviews.lms.domain.AbstractEntity;
import tutsviews.lms.domain.media.Audio;
import tutsviews.lms.domain.media.Image;
import tutsviews.lms.domain.media.Text;
import tutsviews.lms.domain.media.Video;
import tutsviews.lms.domain.util.ContentType;

@Entity
@Data
public class Content extends AbstractEntity {

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
	
	
	
	
	

}
