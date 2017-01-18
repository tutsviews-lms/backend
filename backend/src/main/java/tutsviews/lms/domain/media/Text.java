package tutsviews.lms.domain.media;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tutsviews.lms.domain.course.Content;
import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Text extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String htmlText;  
	
	@NotNull
	private String simpleText;
	
	@JsonIgnore
	@OneToOne
    @JoinColumn(name = "id")
	private Content content;
	

	public Content getContent() {
		return content;
	}




	public void setContent(Content content) {
		this.content = content;
	}




	public String getHtmlText() {
		return htmlText;
	}




	public void setHtmlText(String htmlText) {
		this.htmlText = htmlText;
	}




	public String getSimpleText() {
		return simpleText;
	}




	public void setSimpleText(String simpleText) {
		this.simpleText = simpleText;
	}




	public Text() {
		super();
	}

	
	
}
