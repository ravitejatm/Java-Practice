package practice.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class coursejdbcRepository {

    private JdbcTemplate springjdbcTemplate;

    private static String INSERT_QUERY =
            """
                    insert into course(id, name, author)
                    values (?, ?, ?);
            """;
    private static String DELETE_QUARY =
            """
                    delete from course
                    where id = ?
            """;
    private static String SELECT_QUARY =
            """
                    select * from course
                    where id = ?
            """;

    public void insert(Course course) {
        springjdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());

    }
    public void deleteById(int id) {
        springjdbcTemplate.update(DELETE_QUARY, id);
    }
    public void findById(int id) {
        springjdbcTemplate.queryForObject(SELECT_QUARY,
                new BeanPropertyRowMapper<>(Course.class), id);
        //Requestset -->Bean =>row mapper =>
        //id

    }

}
