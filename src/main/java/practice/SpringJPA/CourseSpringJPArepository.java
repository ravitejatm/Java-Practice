package practice.SpringJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CourseSpringJPArepository extends JpaRepository<Course,Long> {

    //Custom method
    List<Course> findByAuthor(String author);
}