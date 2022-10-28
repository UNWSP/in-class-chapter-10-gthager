
public class DeliveryPizza extends Pizza {
private String address;
private double deliveryFee;
public void DelvieryPizza(String description, double price, String address) {
	super.setDescription(description);
	super.setPrice(price);
	this.address = address;
	if (price > 15) {
		deliveryFee = 5;
	}
	else deliveryFee = 3;
}
public void display() {
	super.display();
	System.out.println("\nAddress: "+ address + "\nDelivery Fee: $" + deliveryFee);
}
public double getDeliveryFee() {
	return deliveryFee;
}
public void setDeliveryFee(double deliveryFee) {
	this.deliveryFee = deliveryFee;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
