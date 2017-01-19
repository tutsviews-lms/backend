package tutsviews.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.media.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

	
}
