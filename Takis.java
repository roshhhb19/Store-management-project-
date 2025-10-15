public class Takis extends Chips {
private boolean spicy;

public Takis() {
super("Takis", "Fuego", 1.50);
this.spicy = true;
}

public Takis(String name, String flavor, double price, boolean spicy) {
super(name, flavor, price);
this.spicy = spicy;
}

public boolean getSpicy() {
return spicy;
}

public void setSpicy(boolean spicy) {
this.spicy = spicy;
}

public String toString() {
return super.toString() + "\nSpicy: " + spicy;
 }
}
