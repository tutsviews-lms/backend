package tutsviews.lms.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Lecture;

@Repository
public interface LectureRepositoryImpl extends JpaRepository<Lecture,Long> {

}
