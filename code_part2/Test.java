
public class Test {

	public static void main(String[] args) {
		System.out.println("Employee Falcon's information:");
		Employee Falco = new Employee("Falco", 40, 15.50);
		System.out.println("Name: " + Falco.getName());
		System.out.println("Number: " + Falco.getHours());
		System.out.println("Postal code: " + Falco.getRate());
		// adding an address to Falco
		Falco.addAddress("Queen", 48, "K1P1N2");
		System.out.println("Employee address: \n");
		Falco.getAddress();
		System.out.println();

		System.out.println();
		Falco.addAddress("King Edward", 800, "K1N6N5");
		System.out.println("Employee address: \n");
		Falco.getAddress();
		
		/* add more address
		System.out.println();
		Falco.addAddress("Waterloo", 10086, "K8U4Y7");
		System.out.println("Employee address: \n");
		Falco.getAddress();

		System.out.println();
		Falco.addAddress("London", 686, "S1R4E4");
		System.out.println("Employee address: \n");
		Falco.getAddress();

		System.out.println();
		Falco.addAddress("Western", 1314, "H7Y6T5");
		System.out.println("Employee address: \n");
		Falco.getAddress();

		System.out.println();
		Falco.addAddress("Brandon", 21, "L9I8U7");
		System.out.println("Employee address: \n");
		Falco.getAddress();

		System.out.println();
		Falco.addAddress("Trunney's Pasture", 69, "K8V5S3");
		*/
	}
}
