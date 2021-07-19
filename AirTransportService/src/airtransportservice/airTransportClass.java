package airtransportservice;

import java.util.Scanner;

public class airTransportClass implements airTransportInterface {

	@Override
	public int airTransport() {
		
		System.out.println("\n                         Welcome to Air Transport Services!!!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("We provide 3 types of Aircrafts \n Type 1 : Helicopter \n Type 2 : Seaplane "
				+ "\n Type 3 : Private Jet");

		System.out.print("\nEnter The Aircraft Type Number :");
		int typeNo = sc.nextInt();
		
		return typeNo;
	}

}
