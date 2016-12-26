package tutsviews.lms.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Section;

@Repository
public interface SectionRepositoryImpl extends JpaRepository<Section,Long>{

}
