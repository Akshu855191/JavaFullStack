public class Product1 {
    String name; 
    Categories category;
  public Product1(String productName, Categories productCategories) {
    this.name = productName;
    this.category = productCategories;
    }
  public static void main(String[] args) {
    Product1 Cricket = new Product1("Cricket", Categories.SPORTS);
    Product1 Fan = new Product1("FAN", Categories.ELECTRONICS);
    System.out.println(Cricket);
    }
@Override
    public String toString() {
    return "Product1 [name=" + name + ", category=" + category + "]";
    }
}


