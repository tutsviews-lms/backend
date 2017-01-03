package tutsviews.lms.domain.media;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Text extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String htmlText;  
	
	@NotNull
	private String simpleText;
	

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
