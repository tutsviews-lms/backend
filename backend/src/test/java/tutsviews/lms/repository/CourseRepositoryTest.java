package tutsviews.lms.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import tutsviews.lms.AbstractTest;
import tutsviews.lms.domain.course.Course;


public class CourseRepositoryTest extends AbstractTest {
	
	@Autowired
	CourseRepository courseRepository;
	
	
	@Test
	public void search_All(){
		List<Course> courses = courseRepository.findAll();
		assertThat(courses.size(), is(4));
	}
	
	@Test
	public void search_NoCourseEntriesFound_ShouldReturnEmptyList(){
		List<Course> courses = courseRepository.findCoursesByNameCourse("NOT_FOUND");
		assertThat(courses.size(), is(0));
	}
	
	
	
	@Test
	public void  search_OneCourseEntryFound_ShouldReturnAListOfOneEntry(){
		List<Course> courses = courseRepository.findCoursesByNameCourse("Git with Alaeddine");
		assertThat(courses.size(), is(1));
		assertThat(courses.get(0), hasProperty("titleCourse", is("Git")));
	}
	
	
	
	@Test
	public void search_TwoCoursesEntriesFound_ShouldReturnAListOfTwoEntries(){
		List<Course> courses =courseRepository.findCoursesByNameCourse("Git forever");
		assertThat(courses.size(), is(2));
	}

}
