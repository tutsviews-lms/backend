package tutsviews.lms.domain.media;

import javax.persistence.CascadeType; 
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tutsviews.lms.domain.author.Author;
import tutsviews.lms.domain.course.Content;
import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Image extends AbstractEntity {

	
	private static final long serialVersionUID = 8645020540682109284L;

	@NotNull
	private String nameImage;
	
	@NotNull
	private String urlImage;
	
	@NotNull
	private String uriImage;
	
	@NotNull
	private int widhImage;
	
	@NotNull
	private int heightImage;
	
	@JsonIgnore
	@OneToOne(cascade = { CascadeType. ALL })
	private Content content;
	
	@JsonIgnore
	@OneToOne(cascade = { CascadeType. ALL })
	private Author author;

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

	public int getWidhImage() {
		return widhImage;
	}

	public void setWidhImage(int widhImage) {
		this.widhImage = widhImage;
	}

	public int getHeightImage() {
		return heightImage;
	}

	public void setHeightImage(int heightImage) {
		this.heightImage = heightImage;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
	
}
