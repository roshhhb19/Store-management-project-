public class StoreRunner {
public static void main(String[] args) {
  
Chips c = new Chips("Plain Chips", "Original", 1.00);
System.out.println("Flavor: " + c.getFlavor());
System.out.println("Price: " + c.getPrice());
System.out.println("-----------------------------");

Takis t = new Takis("Takis", "Spicy", 1.50, true);
System.out.println("Flavor: " + t.getFlavor());
System.out.println("Price: " + t.getPrice());
System.out.println("Spicy?: " + t.getSpicy());
System.out.println("-----------------------------");

Cheetos ch = new Cheetos("Cheetos", "Cheese", 1.25, true);
System.out.println("Flavor: " + ch.getFlavor());
System.out.println("Price: " + ch.getPrice());
System.out.println("Cheesy?: " + ch.getCheesy());
System.out.println("-----------------------------");
 }
}
