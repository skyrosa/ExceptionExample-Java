package classes;

public class App {

	public static void main(String[] args) throws MaintenanceException {
		ListOfNumbers listNumbers = new ListOfNumbers();
		
		listNumbers.writeList();

		try {
			listNumbers.writeList();
		} catch (MaintenanceException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Programa finalizado");
		
	}

}
