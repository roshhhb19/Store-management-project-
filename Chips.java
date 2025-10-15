public class Chips {
private String name;
private String flavor;
private double price;

public Chips() {
this("Generic Chips", "Original", 1.00);
}

public Chips(String name, String flavor, double price) {
this.name = name;
this.flavor = flavor;
this.price = price;
}

public String getName() {
return name;
}

public String getFlavor() {
return flavor;
}

public double getPrice() {
return price;
}

public void setName(String name) {
this.name = name;
}

public void setFlavor(String flavor) {
this.flavor = flavor;
}

public void setPrice(double price) {
this.price = price;
}

public String toString() {
return "Name: " + name + "\nFlavor: " + flavor + "\nPrice: $" + price;
 }
}
