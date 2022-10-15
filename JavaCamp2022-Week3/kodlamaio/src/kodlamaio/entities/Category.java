package kodlamaio.entities;

public class Category {

	public Category(String categoryName, int desk) {
		this.categoryName = categoryName;
	}

	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
