public class Product {
	//private static final String ELECTRONIC = null;
	String pName;       // 
	Category pCategory;
	
	public Product(String productName,Category pCategory) {  //PARAMETRIES CONSTRUCTOR.
		this.pName = productName;   //No need to create object for non static variable it is 
		this.pCategory = pCategory; 
	}
	public static void main(String[] args) {
		Product laptop = new Product("Laptop", Category.ELECTRONICS); // Created object of class product and and assign  
		Product shirt = new Product("T-shirt", Category.CLOTHING);
		Product novel = new Product("Novel", Category.BOOKS);
		Product cricket = new Product("Cricket", Category.SPORTS);
		
		System.out.println(laptop);
		System.out.println(shirt);
		System.out.println(novel);
		System.out.println(cricket);
		

	}
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", pCategory=" + pCategory + "]";
	}

}
