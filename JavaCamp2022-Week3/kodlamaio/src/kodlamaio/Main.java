package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.HibernateDao;
import kodlamaio.dataAccess.JdbcDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;

public class Main {

    public static void main(String[] args) throws Exception {

        Category category = new Category("Programlama",1);

        Course course = new Course("Java","Engin Demiroğ",799);


        Logger[] loggers = {new DatabaseLogger()};
        CategoryManager categoryManager = new CategoryManager(new HibernateDao(),loggers);
        CourseManager courseManager = new CourseManager(new JdbcDao(),loggers);

        categoryManager.add(category);

        courseManager.add(course);




    }
}
