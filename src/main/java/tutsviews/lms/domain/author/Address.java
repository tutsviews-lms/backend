package tutsviews.lms.domain.author;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable @Access(AccessType.FIELD)
public class Address {
	
    private String street; 
    
    private String city; 
    
    private String state;
    
    @Column(name="ZIP_CODE")
    private String zip;
    
}