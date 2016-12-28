package tutsviews.lms.domain.media;

import javax.persistence.Entity; 
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import tutsviews.lms.domain.course.Content;
import tutsviews.lms.domain.util.AbstractEntity;

@Entity
public class Text extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@NotNull
	private Text htmlText;  
	
	@NotNull
	private Text simpleText;
	
	@OneToOne
	private Content content;

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

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Text() {
		super();
	}

	
	
}
