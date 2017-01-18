package tutsviews.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.course.Lecture;

@Repository
public interface LectureRepository extends JpaRepository<Lecture,Long> {

}
