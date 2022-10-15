package kodlamaio.business;

import java.util.ArrayList;

import kodlamaio.entities.Course;

public class MainManager {
	private Course course;
	ArrayList<String> courses = new ArrayList<>();
	ArrayList<String> categories = new ArrayList<>();

	// kurs adlarının aynı olup olmadığının doğrulanması
	public void isThereCourse(String course) throws Exception {

		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i) == course) {
				throw new Exception("\nAynı isimde bir kurs zaten var !");
			}
		}
		courses.add(course);
	}

	// kategori adlarının aynı olup olmadığının doğrulanması
	public void isThereCategories(String category) throws Exception {

		for (int i = 0; i < categories.size(); i++) {
			if (categories.get(i) == category) {
				throw new Exception("\nAynı isimde bir kategori zaten var !");
			}
		}
		categories.add(category);

	}

	// kurs ücretinin sıfırdan fazla olmasının doğrulanması
	public void priceControl(double coursePrice) throws Exception {
		if (coursePrice < 0) {
			throw new Exception("\nKurs ücreti 0'dan fazla olmalıdır !");
		}
	}

}
