package tutsviews.lms.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Content;

@Repository
public interface ContentRepositoryImpl extends JpaRepository<Content,Long>{

}
