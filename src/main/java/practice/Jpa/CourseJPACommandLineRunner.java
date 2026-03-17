package practice.Jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import practice.jdbc.Course;

public class CourseJPACommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJPARepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "learn aws jpa", "in28min"));
        repository.insert(new Course(2,"learn gcp jpa", "in28min"));
        repository.insert(new Course(3, "azure jpa", "in28min"));

        repository.deleteById(1);
    }
}
