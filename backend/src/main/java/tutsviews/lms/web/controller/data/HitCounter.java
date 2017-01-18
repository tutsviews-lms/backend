package tutsviews.lms.web.controller.data;

import org.springframework.stereotype.Component;

@Component
public class HitCounter {

	private int hits ;

	
	
	public HitCounter() {
		
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}
	
	
}
