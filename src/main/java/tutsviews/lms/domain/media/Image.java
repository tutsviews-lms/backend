package tutsviews.lms.domain.media;

import javax.persistence.Entity; 
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.domain.course.Content;
import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Image extends AbstractEntity {

	
	private static final long serialVersionUID = 8645020540682109284L;

	@NotBlank(message="Champs de saisi trop court")
	private String nameImage;
	
	@NotBlank(message="Champs de saisi trop court")
	private String urlImage;
	
	@NotBlank(message="Champs de saisi trop court")
	private String uriImage;
	
	private int widthImage;
	
	private int heightImage;

	@JsonIgnore
	@OneToOne
    @JoinColumn(name = "id")
	private Content content;
	
	@JsonIgnore
	@OneToOne
    @JoinColumn(name = "id")
	private Author author;
	

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public String getNameImage() {
		return nameImage;
	}

	public void setNameImage(String nameImage) {
		this.nameImage = nameImage;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getUriImage() {
		return uriImage;
	}

	public void setUriImage(String uriImage) {
		this.uriImage = uriImage;
	}

	

	public int getWidthImage() {
		return widthImage;
	}

	public void setWidthImage(int widthImage) {
		this.widthImage = widthImage;
	}

	public int getHeightImage() {
		return heightImage;
	}

	public void setHeightImage(int heightImage) {
		this.heightImage = heightImage;
	}

	

	
	
}
