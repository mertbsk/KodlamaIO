package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		Customer engin = new Customer(1, "Engin", "Demirog");
		customerManager.add(engin);
	}

}