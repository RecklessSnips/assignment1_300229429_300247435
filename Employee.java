package Assignment_1;

public class Employee {

	private String name;
	private double hours;
	private double rate;
	

	public Employee(String name, double hours, double rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;

		getAddress();
	}

	public String getName() {
		return this.name;
	}

	public double getHours() {
		return this.hours;
	}

	public double getRate() {
		return this.rate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void getAddress() {
		Address address = new Address("Queen", 48, "K1P1N2");
		Address address2 = new Address("King Edward", 800, "K1N6N5");
		Address[] a = new Address[5];
		a[0] = address;
		a[1] = address2;

		for (int i = 0; i < 2; i++) {
			System.out.println(a[i]);
		}
	}
}

class Address {
	private String street;
	private int number;
	private String postal;

	public Address(String street, int number, String postal) {
		this.street = street;
		this.number = number;
		this.postal = postal;
	}

	public String toString() {
		return "Street: " + this.street + " " + "Number: " + +this.number + " " + "Postal: " + this.postal;
	}
}
