package kodlamaio.business;

import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private MainManager manager= new MainManager();

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers2){
        this.categoryDao=categoryDao;
        this.loggers=loggers2;
    }

    public void add(Category category) throws Exception {
        manager.isThereCategories(category.getCategoryName());
        categoryDao.add(category);

        for(Logger logger: loggers){
            logger.log("\nKategori adı: "+category.getCategoryName());

        }

    }
}