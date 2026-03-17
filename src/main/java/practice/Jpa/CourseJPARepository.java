package practice.Jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import practice.jdbc.Course;

@Repository
@Transactional
public class CourseJPARepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(practice.jdbc.Course course) {
        entityManager.persist(course);
    }
    public practice.jdbc.Course findById(int id) {
        return entityManager.find(practice.jdbc.Course.class, id);
    }
    public void deleteById(int id) {
        practice.jdbc.Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }


}
