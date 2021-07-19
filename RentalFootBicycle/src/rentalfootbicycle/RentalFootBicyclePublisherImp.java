package rentalfootbicycle;

import java.util.Random;
import java.util.Scanner;

public class RentalFootBicyclePublisherImp implements RentalFootBicyclePublisher{

	private int numOfBicycle = 0;
	private double totalCharge = 0;
	private int numOfDays = 0;
	private int referenceNo;
	private String custName;
	private char vote = 'y';
	
	Scanner obj = new Scanner(System.in);
	@Override
	public void rentalFootBicycle() {
		System.out.println("\n                         Hello welcome to Rental Service(Bicycle).");
		System.out.println("*Bicycle rental is calculated rental days");
		System.out.println("*Rs.1000/- per day");
		
		
		Random random = new Random();
		referenceNo = random.nextInt(1000);
		
		System.out.print("Enter the your name			:");
		custName = obj.next();
		
		
		while(true) {
			if(vote == 'y' || vote == 'Y') {
				int bicycleCount = 0;
				int days = 0;
				while(true) {
					System.out.print("Enter the number of Bicycle		:");
					String bicycle = obj.next();
					if(isInt(bicycle) == true) {
						bicycleCount = Integer.parseInt(bicycle);
						numOfBicycle = numOfBicycle + bicycleCount;
						break;
					}
					System.out.println("Invalid Input !");
				}
				
				while(true) {
					System.out.print("Enter number of rental days		:");
					String rental_days = obj.next();
					if(isInt(rental_days) == true) {
						days = Integer.parseInt(rental_days);
						numOfDays = numOfDays + days;
						break;
					}
					System.out.println("Invalid Input !");
				}
				
				totalCharge = totalCharge + ((numOfDays*1000)*numOfBicycle);
				
				System.out.println("==================================");
				System.out.println("Customer Name 			:"+custName);
				System.out.println("Reference Number		:"+referenceNo);
				System.out.println("Number of Bicycle		:"+numOfBicycle);
				System.out.println("Number of Days			:"+numOfDays);
				System.out.println("Estimated Total Charge		:"+totalCharge);
				
			}else if(vote == 'n' || vote == 'N') {
				
				System.out.println("==================================");
				System.out.println("==========Rental Details==========");
				System.out.println("Customer Name			:"+custName);
				System.out.println("Reference Number		:"+referenceNo);
				System.out.println("Number of Bicycle		:"+numOfBicycle);
				System.out.println("Number of Days			:"+numOfDays);
				System.out.println("Estimated Total Charge	:"+totalCharge);
				System.out.println("==================================");
				break;
			}
			
			System.out.print("\nDo you need more services?	(Y|N)	:");
			vote = obj.next().charAt(0);
		}
		
		System.out.println("***Thank you for using the service..***");
	}
	
	public static void main(String[] args) {
		RentalFootBicyclePublisher x = new RentalFootBicyclePublisherImp();
		x.rentalFootBicycle();
	}
	
	public static boolean isInt(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
		
	}

}
