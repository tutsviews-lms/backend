package tutsviews.lms.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Image extends AbstractEntity {

	
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
	
	@OneToOne(cascade = { CascadeType. ALL })
	private Content content;
	
	@OneToOne(cascade = { CascadeType. ALL })
	private Author author;
	
}
