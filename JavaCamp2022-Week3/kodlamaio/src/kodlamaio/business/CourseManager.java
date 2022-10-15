package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private MainManager manager= new MainManager();

    public CourseManager(){

    }


    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }

    public void add(Course course) throws Exception {
        manager.isThereCourse(course.getCourseName());
        manager.priceControl(course.getCoursePrice());
        courseDao.add(course);
        for(Logger logger:loggers){
            logger.log("\nKurs Adı: "+course.getCourseName());
            logger.log("\nKurs Ücreti: "+ course.getCoursePrice());
        }
    }




}
