package practice.SpringJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import practice.SpringJPA.Course;

public class CourseSpringJPACommandLineRunner implements CommandLineRunner {

    @Autowired
    public CourseSpringJPArepository repository;

    @Override
    public void run(String... args) throws Exception {

        repository.save(new Course(1L, "learn aws jpa", "in28min"));
        repository.save(new Course(2L,"learn gcp jpa", "in28min"));
        repository.save(new Course(3L, "azure jpa", "in28min"));


        repository.deleteById(1L);

        System.out.println(repository.findById(2L));

        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("in28min"));


    }
}
