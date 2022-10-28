
public class Pizza {
private String description;
private double price;
public void Pizza(String description, double price) {
	this.description = description;
	this.price = price;
}
public void display() {
	System.out.print("\nDescription: " + this.description + "\nPrice: $" + this.price);
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
