package kodlamaio.dataAccess;

import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class JdbcDao implements CourseDao,CategoryDao,InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile eklendi : Kategori");
    }

    @Override
    public void add(Course course) {
        System.out.println("JDBC ile eklendi : Kurs");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile eklendi : Öğretmen");
    }
}