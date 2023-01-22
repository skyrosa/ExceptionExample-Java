package classes;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

//	Argumentos	
	private List<Integer> list;
	private static final int SIZE = 10;
	
//	Constructor	
	public ListOfNumbers() {
		this.list = new ArrayList<Integer>(SIZE);
		for(int i = 0; i < SIZE; i++) {
			this.list.add(i * 4);				// <--- VALOR
		}	
	}
	
	public void writeList() throws MaintenanceException {
		FileWriter writer;
		try {
			writer = new FileWriter("myFile.txt");
			PrintWriter out = new PrintWriter(writer);
			for (int i=0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
			}
			out.close();
			
//		} catch (FileNotFoundException ex) {
//			System.out.println(ex.getMessage());
			
		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Estamos en desayuno, vuelva más tarde");
			throw new MaintenanceException("Mantenimiento");
	}
}
	
	
	
}
