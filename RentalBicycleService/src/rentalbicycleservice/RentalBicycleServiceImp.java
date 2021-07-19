package rentalbicycleservice;

import java.util.Scanner;

public class RentalBicycleServiceImp implements RentalBicycleService{

	@Override
	public int rentalBicycle() {
		Scanner obj = new Scanner(System.in);
		System.out.println("\n====Select bicycle type====");
		System.out.println("1 - Moter Bike ");
		System.out.println("2 - Foot Bicycle");
		System.out.println("Enter the type number :");
		int selection = obj.nextInt();
		
			return selection;
		
	}
	
}
