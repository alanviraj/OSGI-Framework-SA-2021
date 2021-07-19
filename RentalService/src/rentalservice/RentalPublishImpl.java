package rentalservice;

import java.util.Scanner;

public class RentalPublishImpl implements RentalPublish {

	@Override
	public String publishRentalService() {
		
		return "\n\n               Welcome to Rental Services...!!!               ";
	}

	@Override
	public int selectRentalService() {
		
		System.out.println("We offer you following Transport methods...!!!");
		System.out.println("\n** Land Vehicles Transports    : type 1");
		System.out.println("** Air Transports              : type 2");
		System.out.println("** Aquatic Transports          : type 3");
		System.out.println("** Bicycle Transports          : type 4\n");

		
		System.out.print("\n Kindly select an option from above : ");
		
		Scanner select = new Scanner(System.in);
		int selection = select.nextInt();

		
		return selection;
}
}