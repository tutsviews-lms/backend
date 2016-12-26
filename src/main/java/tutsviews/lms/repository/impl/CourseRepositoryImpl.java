package tutsviews.lms.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Course;

@Repository
public interface CourseRepositoryImpl extends JpaRepository<Course,Long>{

}
