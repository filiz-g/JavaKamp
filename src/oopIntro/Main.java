package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		
		Product product1=new Product();
		product1.setId(1);
		product1.setName("Lenovo V14");
		product1.setUnitPrice(15000);
		product1.setDetail("16 GB Ram");
		product1.setDiscount(5);
	
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("32 GB Ram");
		product2.setDiscount(10);
	    
		Product product3=new Product();
		product3.setId(3);
		product3.setName("Hp 5");
		product3.setUnitPrice(10000);
		
		
		
		
		Product[] products= {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitPrice());
			System.out.println("**********");
			
		}
		
		//System.out.println(products.length);
		
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
 
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		
	
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());

}
}
