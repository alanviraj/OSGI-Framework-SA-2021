package boatship;

import java.util.Scanner;

import org.osgi.framework.ServiceReference;
import org.osgi.framework.BundleContext;


public class BoatShipClass implements BoatShipInterface{

	@Override
	public int Method1() {
		System.out.println("\n                         Hello welcome to Aquatic Transport Services(Boats & Cruises).");
		Scanner select = new Scanner(System.in);
		
		System.out.println("We provide 2 types of services \n 1.Inland Services \n 2.Oceanic Cruise Services");
		System.out.println("For Inland Services Enter 1 & For Oceanic Cruise Services Enter 2");
		System.out.println("Enter The Number : ");
		int typeNumber = select.nextInt(); 
		
		return typeNumber;
	}
	
	
}
