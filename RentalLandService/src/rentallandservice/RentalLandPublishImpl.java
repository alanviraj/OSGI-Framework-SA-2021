package rentallandservice;

import java.util.Scanner;

public class RentalLandPublishImpl implements RentalLandPublish{

	@Override
	public String landRental() {
		
		System.out.println("\n                         Hello welcome to Rental Service(Land Vehicle Transports)...!!!");
		Scanner select = new Scanner(System.in);
		System.out.print("\nEnter Your name : ");
		String name = select.next().toString();
		
		System.out.print("\nEnter Your 10 digit phone number : ");
		String phone = select.next().toString();
		
		if(phone.length() != 10) {
			System.out.println("Invalid Phone number...!!!\nPlease Check and try again...!!!\n");
			return landRental();
		}
		
		else {
			System.out.print("\nPlease enter number of passangers : ");
			int passangers = select.nextInt();
			
			if(passangers > 0 && passangers <= 4) {
							
				System.out.println("\nThe suitable vehicle type for your journey is Car.");
				
				System.out.println("\nWe provide below packages for you. If you need another destination please select other as your location type.");			
				System.out.println(
						  "** Anuradhapura(including Sigiriya) : type 1 \n"
						+ "** Polonnaruwa                      : type 2 \n"
						+ "** Yapanaya                         : type 3 \n"
						+ "** Mathara                          : type 4 \n"
						+ "** Other                            : type 5");
				System.out.print("\nPlease select your location : ");
				int place = select.nextInt();
				System.out.println("Enter your journey date : ");
				String dateGoing = select.next().toString();
				
				double anurdhapuraPrice = 5000;
				double polonnaruwaPrice = 4000;
				double yapanayaPrice = 8000;
				double matharaPrice = 2000;
				double total;
				double extrakm;
				double additionalPayment;
				
				if(place == 1) {
					
					System.out.println("\nYour selected location is Anuradhapura(including Sigiriya)");
					System.out.println("Please select number of days you want to rent the car : ");
					int days = select.nextInt();
					total = anurdhapuraPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Car");
					System.out.println("Destination : Anuradhapura(including Sigiriya)");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
				
					
				}
				
				else if(place == 2){
					
					System.out.println("\nYour selected location is Polonnaruwa");
					System.out.println("Please select number of days you want to rent the car : ");
					int days = select.nextInt();
					total = polonnaruwaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Car");
					System.out.println("Destination : Polonnaruwa");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 3){
					
					System.out.println("\nYour selected location is Yapanaya");
					System.out.println("Please select number of days you want to rent the car : ");
					int days = select.nextInt();
					total = yapanayaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Car");
					System.out.println("Destination : Yapanaya");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 4){
					
					System.out.println("\nYour selected location is Mathara");
					System.out.println("Please select number of days you want to rent the car : ");
					int days = select.nextInt();
					total = matharaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Car");
					System.out.println("Destination : Mathara");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 5){
					
					System.out.println("We have 200km package for just Rs.10000.00. For additional kms we will calculate it to the total payment.");
					System.out.println("Please enter number of kms : ");
					int kms = select.nextInt();
					
					if(kms <= 200 && kms > 0) {
						total = 10000;
						
						System.out.println("*********************************************************\n\n");
						
						System.out.println("Name : " + name);
						System.out.println("Phone number : " + phone);
						System.out.println("Travel option : Car");
						System.out.println("Destination : Other");
						System.out.println("Date : " + dateGoing);
						System.out.println("Number of kms : " +  kms);
						System.out.println("Number of passangers : " + passangers);
						System.out.println("Total price : " + total);
						
						System.out.println("\n\n*********************************************************");
						
					}
					
					else if(kms > 200) {
						
						extrakm = kms - 200;
						
						total = 10000 + (extrakm * 150);
						additionalPayment = total - 10000;
						
						System.out.println("*********************************************************\n\n");
						
						System.out.println("Name : " + name);
						System.out.println("Phone number : " + phone);
						System.out.println("Travel option : Car");
						System.out.println("Destination : Other");
						System.out.println("Date : " + dateGoing);
						System.out.println("Number of kms : " +  kms);
						System.out.println("Number of additional kms : " +  extrakm);
						System.out.println("Number of passangers : " + passangers);
						System.out.println("Additional payment : " +  additionalPayment);
						System.out.println("Total price : " + total);
						
						System.out.println("\n\n*********************************************************");
						
					}
					else {
						System.out.println("Invalid option.");
						return landRental();
					}
					
				}
				else {
					System.out.println("Invalid selection.");
					return landRental();
				}
							
			}
			

			else if(passangers > 4 && passangers <= 15) {
				
				System.out.println("\nThe suitable vehicle type for your journey is Van.");
				System.out.println("\nWe provide below packages for you. If you need another destination please select other as your location type.");			
				System.out.println(""
						+ "** Anuradhapura(including Sigiriya) : type 1 \n"
						+ "** Polonnaruwa                      : type 2 \n"
						+ "** Yapanaya                         : type 3 \n"
						+ "** Mathara                          : type 4 \n"
						+ "** Other                            : type 5");
				System.out.print("\nPlease select your location : ");
				int place = select.nextInt();
				System.out.println("\nEnter your journey date : ");
				String dateGoing = select.next().toString();
				
				double anurdhapuraPrice = 10000;
				double polonnaruwaPrice = 9000;
				double yapanayaPrice = 15000;
				double matharaPrice = 8000;
				double total;
				double extrakm;
				double additionalPayment;
				
				if(place == 1) {
					
					System.out.println("\nYour selected location is Anuradhapura(including Sigiriya)");
					System.out.println("Please select number of days you want to rent the Van : ");
					int days = select.nextInt();
					total = anurdhapuraPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Van");
					System.out.println("Destination : Anuradhapura(including Sigiriya)");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 2){
					
					System.out.println("\nYour selected location is Polonnaruwa");
					System.out.println("Please select number of days you want ot rent the Van : ");
					int days = select.nextInt();
					total = polonnaruwaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Van");
					System.out.println("Destination : Polonnaruwa");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 3){
					
					System.out.println("\nYour selected location is Yapanaya");
					System.out.println("Please select number of days you want ot rent the Van : ");
					int days = select.nextInt();
					total = yapanayaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Van");
					System.out.println("Destination : Yapanaya");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 4){
					
					System.out.println("\nYour selected location is Mathara");
					System.out.println("Please select number of days you want ot rent the Van : ");
					int days = select.nextInt();
					total = matharaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Van");
					System.out.println("Destination : Mathara");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 5){
					
					System.out.println("We have 200km package for just Rs.20000.00. For additional kms we will calculate it to the total payment.");
					System.out.println("Please enter number of kms : ");
					int kms = select.nextInt();
					
					if(kms <= 200 && kms > 0) {
						total = 20000;
						
						System.out.println("*********************************************************\n\n");
						
						System.out.println("Name : " + name);
						System.out.println("Phone number : " + phone);
						System.out.println("Travel option : Van");
						System.out.println("Destination : Other");
						System.out.println("Date : " + dateGoing);
						System.out.println("Number of kms : " +  kms);
						System.out.println("Number of passangers : " + passangers);
						System.out.println("Total price : " + total);
						
						System.out.println("\n\n*********************************************************");
						
					}
					
					else if(kms > 200) {
						
						extrakm = kms - 200;
						
						total = 20000 + (extrakm * 200);
						additionalPayment = total - 20000;
						
						System.out.println("*********************************************************\n\n");
						
						System.out.println("Name : " + name);
						System.out.println("Phone number : " + phone);
						System.out.println("Travel option : Van");
						System.out.println("Destination : Other");
						System.out.println("Date : " + dateGoing);
						System.out.println("Number of kms : " +  kms);
						System.out.println("Number of additional kms : " +  extrakm);
						System.out.println("Number of passangers : " + passangers);
						System.out.println("Additional payment : " +  additionalPayment);
						System.out.println("Total price : " + total);
						
						System.out.println("\n\n*********************************************************");
						
					}
					else {
						System.out.println("Invalid option.");
						return landRental();
					}
					
				}
				else {
					System.out.println("Invalid selection.");
					return landRental();
				}
				
			}
			
			else if(passangers > 15 && passangers <= 50) {
				
				System.out.println("\nThe suitable vehicle type for your journey is Bus.");
				System.out.println("\nWe provide below packages for you. If you need another destination please select other as your location type.");			
				System.out.println(""
						+ "** Anuradhapura(including Sigiriya) : type 1 \n"
						+ "** Polonnaruwa                      : type 2 \n"
						+ "** Yapanaya                         : type 3 \n"
						+ "** Mathara                          : type 4 \n"
						+ "** Other                            : type 5");
				System.out.print("\nPlease select your location : ");
				int place = select.nextInt();
				System.out.println("\nEnter your journey date : ");
				String dateGoing = select.next().toString();
				
				double anurdhapuraPrice = 35000;
				double polonnaruwaPrice = 34000;
				double yapanayaPrice = 45000;
				double matharaPrice = 23000;
				double total;
				double extrakm;
				double additionalPayment;
				
				if(place == 1) {
					
					System.out.println("\nYour selected location is Anuradhapura(including Sigiriya)");
					System.out.println("Please select number of days you want to rent the Bus : ");
					int days = select.nextInt();
					total = anurdhapuraPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Bus");
					System.out.println("Destination : Anuradhapura(including Sigiriya)");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 2){
					
					System.out.println("\nYour selected location is Polonnaruwa");
					System.out.println("Please select number of days you want to rent the Bus : ");
					int days = select.nextInt();
					total = polonnaruwaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Bus");
					System.out.println("Destination : Polonnaruwa");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 3){
					
					System.out.println("\nYour selected location is Yapanaya");
					System.out.println("Please select number of days you want to rent the Bus : ");
					int days = select.nextInt();
					total = yapanayaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Bus");
					System.out.println("Destination : Yapanaya");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 4){
					
					System.out.println("\nYour selected location is Mathara");
					System.out.println("Please select number of days you want to rent the Bus : ");
					int days = select.nextInt();
					total = matharaPrice * days;
					
					System.out.println("*********************************************************\n\n");
					
					System.out.println("Name : " + name);
					System.out.println("Phone number : " + phone);
					System.out.println("Travel option : Bus");
					System.out.println("Destination : Mathara");
					System.out.println("Date : " + dateGoing);
					System.out.println("Number of days : " +  days);
					System.out.println("Number of passangers : " + passangers);
					System.out.println("Total price : " + total);
					
					System.out.println("\n\n*********************************************************");
					
				}
				
				else if(place == 5){
					
					System.out.println("We have 200km package for just Rs.40000.00. For additional kms we will calculate it to the total payment.");
					System.out.println("Please enter number of kms : ");
					int kms = select.nextInt();
					
					if(kms <= 200 && kms > 0) {
						total = 40000;
						
						System.out.println("*********************************************************\n\n");
						
						System.out.println("Name : " + name);
						System.out.println("Phone number : " + phone);
						System.out.println("Travel option : Bus");
						System.out.println("Destination : Other");
						System.out.println("Date : " + dateGoing);
						System.out.println("Number of kms : " +  kms);
						System.out.println("Number of passangers : " + passangers);
						System.out.println("Total price : " + total);
						
						System.out.println("\n\n*********************************************************");
						
					}
					
					else if(kms > 200) {
						
						extrakm = kms - 200;
						
						total = 40000 + (extrakm * 200);
						additionalPayment = total - 40000;
						
						System.out.println("*********************************************************\n\n");
						
						System.out.println("Name : " + name);
						System.out.println("Phone number : " + phone);
						System.out.println("Travel option : Bus");
						System.out.println("Destination : Other");
						System.out.println("Date : " + dateGoing);
						System.out.println("Number of kms : " +  kms);
						System.out.println("Number of additional kms : " +  extrakm);
						System.out.println("Number of passangers : " + passangers);
						System.out.println("Additional payment : " +  additionalPayment);
						System.out.println("Total price : " + total);
						
						System.out.println("\n\n*********************************************************");
						
					}
					else {
						System.out.println("Invalid option.");
						return landRental();
					}
					
				}
				else {
					System.out.println("Invalid selection.");
					return landRental();
				}
				
			}
			else if(passangers > 50) {
			
				System.out.println("Passangers Limit exceeded.Please try again!!!");
				return landRental();
			
			}
			else {
				System.out.println("Invalid Entry.");
				return landRental();
			}
			
			System.out.print("\nDo  you need any other service (Y/N) : ");
			char any = 'y';
			any = select.next().charAt(0);
			
			if(any=='N' || any=='n') {
				System.out.println("We will contact you soon.\nThank you & See you again...!!!\n");
			}
			else if (any=='Y' || any=='y') {
				landRental();
			}
			
			
			return "We will contact you soon.\nThank you & See you again...!!!\n";
			
		}	
		
	}

}
