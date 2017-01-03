package tutsviews.lms.domain.media;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Text extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Text htmlText;  
	
	@NotNull
	private Text simpleText;
	


	public Text getHtmlText() {
		return htmlText;
	}

	public void setHtmlText(Text htmlText) {
		this.htmlText = htmlText;
	}

	public Text getSimpleText() {
		return simpleText;
	}

	public void setSimpleText(Text simpleText) {
		this.simpleText = simpleText;
	}



	public Text() {
		super();
	}

	
	
}
