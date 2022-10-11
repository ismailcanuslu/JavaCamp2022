package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(14999);
		product.setStockAmount(10);
		System.out.println(product.getKod()); 
	}

}
