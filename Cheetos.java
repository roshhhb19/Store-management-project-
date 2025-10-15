public class Cheetos extends Chips {
private boolean cheesy;

public Cheetos() {
super("Cheetos", "Cheese", 1.25);
this.cheesy = true;
}

public Cheetos(String name, String flavor, double price, boolean cheesy) {
super(name, flavor, price);
this.cheesy = cheesy;
}

public boolean getCheesy() {
return cheesy;
}

public void setCheesy(boolean cheesy) {
this.cheesy = cheesy;
}

public String toString() {
return super.toString() + "\nCheesy: " + cheesy;
 }
}
