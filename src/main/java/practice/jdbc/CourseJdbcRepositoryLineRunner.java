package practice.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CourseJdbcRepositoryLineRunner implements CommandLineRunner {

 @Autowired
  private coursejdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "learn aws", "in28min"));
        repository.insert(new Course(2,"learn gcp", "in28min"));
        repository.insert(new Course(3, "azure", "in28min"));

        repository.deleteById(1);
    }
}
