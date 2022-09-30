
public class Employee {

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

	int index = 0; // times calling the addAddress() method
	int number = 0; // how many addresses have been created
	private String name;
	private double hours;
	private double rate;
	private Address[] add = new Address[6];

	public Employee(String name, double hours, double rate) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
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

	// Adding address to employee
	public void addAddress(String address, int i, String postal) {
		try {
			add[index] = new Address(address, i, postal);
			index++;
			number++;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array is full.");
		} finally {
			System.out.println("Created address of " + number);
		}
	}

	// Get address from a employee
	public void getAddress() {
		String output = "";
		int i = 0;
		while (i < 6 && add[i] != null) {
			output += add[i] + "\n";
			i++;
		}
		System.out.println(output);
	}
}
