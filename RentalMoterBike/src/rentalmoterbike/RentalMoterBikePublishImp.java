package rentalmoterbike;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RentalMoterBikePublishImp implements RentalMoterBikePublish{
	
	private String custName;
	private int numOfBikes = 0;
	private double totalCharge = 0,numOfKM = 0;
	private int referenceNo;
	private char vote = 'y';
	Scanner obj = new Scanner(System.in);
	
	@Override
	public void rentalMoterBike() {
		System.out.println("\n                         Hello welcome to Rental Service(Bicycle).");
		System.out.println("\n*For the first 100km Rs:1500/-");
		System.out.println("*For any additional 1km Rs:10/-");
		
		Random random = new Random();
		referenceNo = random.nextInt(1000);
		
		System.out.print("\nEnter your name				:");
		custName = obj.nextLine();
		
			while(true) {
				if(vote == 'y' || vote == 'Y') {
					int bikes = 0;
					int KMs = 0;
					while(true) {
						System.out.print("Enter the number of bikes you requered 	:");
						String bikeCount = obj.next();
						if(isInt(bikeCount) == true) {
							bikes = Integer.parseInt(bikeCount);
							numOfBikes = numOfBikes + bikes;
							break;
						}
						System.out.println("Invalid input !");
					}
					
					while(true) {
						System.out.print("Enter the number of KMs to the destination:");
						String KMs_Count = obj.next();
						if(isInt(KMs_Count) == true) {
							KMs = Integer.parseInt(KMs_Count);
							numOfKM = numOfKM + KMs;
							break;
						}
						System.out.println("Invalid input !");
					}
					
					if(KMs > 100 ) {
						totalCharge = totalCharge + (((KMs - 100)*10)+(bikes * 1500));
					}else {
						totalCharge = totalCharge + bikes * 1500;
					}
					
					System.out.println("==================================");
					System.out.println("\nCustomer name			:"+custName);
					System.out.println("Reference Number		:"+referenceNo);
					System.out.println("Number of Bikes			:"+numOfBikes);
					System.out.println("Number of KMs			:"+numOfKM);
					System.out.println("Estimated total Charge		:"+totalCharge);
					
				}else if(vote == 'n' || vote == 'N'){
					System.out.println("==================================");
					System.out.println("==========Rental Details==========");
					System.out.println("Customer Name			:"+custName);
					System.out.println("Reference Number		:"+referenceNo);
					System.out.println("Number of Bicycle		:"+numOfBikes);
					System.out.println("Number of KMs			:"+numOfKM);
					System.out.println("Estimated Total Charge		:"+totalCharge);
					System.out.println("==================================");
					break;
				}
				
				System.out.print("\nDo you need more services?	(Y|N)	:");
				vote = obj.next().charAt(0);
			}
			
			System.out.println("***Thank you for using the service..***");
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
