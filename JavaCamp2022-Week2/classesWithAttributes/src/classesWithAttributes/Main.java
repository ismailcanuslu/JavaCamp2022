package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		//Product product = new Product(1,"laptop","apple laptop",35000,2,"siyah");
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Apple Laptop");
		product.setPrice(25000);
		product.setStockAmount(9);
		product.setRenk("Altın");

		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
