package inlandservices;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class inlandServicesClass implements inlandServicesInterface{

	@Override
	public String Aquatic_Services_Boat() {
		
		String start = null;
		String end = null;
		
		//System.out.println("\n                         Hello welcome to Aquatic Transport Services(Boats & Cruises).");
		Scanner select = new Scanner(System.in);
		
		//System.out.println("We provide 3 types of services \n 1.Inland Services \n 2.Oceanic Cruise Services");
		//System.out.println("For Inland Services Enter 1 & For Oceanic Cruise Services Enter 2");
		//System.out.println("Enter The Number : ");
		//int typeNumber = select.nextInt(); 
		
		//if(typeNumber == 1) {
			System.out.println("\n                         Welcome To Inland(Boat) Services.");
			
			System.out.println("Enter Your Name : ");
			String name_BCJourney = select.next().toString();
			
			System.out.println("\nEnter Your Mobile Number(Please give a valid mobile number!) : ");
			String number_BCJourney = select.next().toString();
			
			String regex = "\\d{10}";
	        Pattern patt = Pattern.compile(regex);
	        Matcher match = patt.matcher(number_BCJourney);
	       
	        while(!(match.matches())) {
	           
	            System.out.println("\nInvalid Contact Number!!!");
	           
	            System.out.print("\nEnter Your Contact Number :");
	            number_BCJourney = select.next();
	            match = patt.matcher(number_BCJourney);
	        }
			
			System.out.println("\nBelow are the locations where we provide boat services to our customers. Please select one from it."
					+ "\n 1 -> Joy Boat Service (Around Kandy Lake)"
					+ "\n 2 -> Diyawanna Boat Service (Around Diyawanna Oya)"
					+ "\n 3 -> Beira Lake Passanger Boat Service (Around Beira Lake)"
					+ "\n 4 -> Gregory Boat Service (Around Gregory Lake)"
					+ "\nPlease enter the number : \n");
			int boatLocationsNumber = select.nextInt();
			
			if (boatLocationsNumber > 4 || boatLocationsNumber <= 0) {
				System.out.println("Invalid Input!! We do not find a location on your input value");
				return Aquatic_Services_Boat();
			}
			
			else {
				System.out.println("\nEnter the number of passengers who are travelling for this journey : ");
				int no_of_Passengers = select.nextInt();
				
					if(no_of_Passengers > 30 || no_of_Passengers <= 0) {
						System.out.println("We allow only 30 passangers for a journey in all our service stations");
						return Aquatic_Services_Boat();
					}
				
					else {
						System.out.println("\nEnter the date of your journey (Please enter in this format dd-mm-yyyy) : ");
						String date_of_BCJourney = select.next().toString();
						
						String regex2 = "\\d{1,2}-\\d{1,2}-\\d{4}";
					       
				        while(!(date_of_BCJourney.matches(regex2))) {
				           
				            System.out.println("\nInvalid Date!!!");
				           
				            System.out.print("\nEnter The journeying Date (dd-mm-yyyy) :");
				            date_of_BCJourney = select.next();
				        }
						
						if(boatLocationsNumber == 1) {
							String place = "Kandy Lake";
							double price_JBS_miniPackage = 4000;
							double price_JBS_Package = 10000;
						
							System.out.println("*********************************************************\n\n");
							System.out.println("Joy Boat Servies");
							System.out.println("\nCustomer Name : " + name_BCJourney);
							System.out.println("Place of journey : " + place);
							System.out.println("Date of the journey : " + date_of_BCJourney);
							System.out.println("Number of passangers : " + no_of_Passengers);
						
								if(no_of_Passengers > 0 && no_of_Passengers <=3 ) {
									System.out.println("Total price : Rs." + price_JBS_miniPackage);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 10) {
									System.out.println("Total price : Rs." + price_JBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 20) {
									System.out.println("Total price : Rs." + 2*price_JBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 30) {
									System.out.println("Total price : Rs." + 3*price_JBS_Package);
								}
								System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
								System.out.println("Thank You & See You Again!");
							System.out.println("\n\n*********************************************************");
					}
						else if (boatLocationsNumber == 2) {
							String place = "Diyawanna Oya";
							double price_DBS_miniPackage = 4500;
							double price_DBS_Package = 10500;
						
							System.out.println("*********************************************************\n\n");
							System.out.println("Diyawanna Boat Service");
							System.out.println("\nCustomer Name : " + name_BCJourney);
							System.out.println("Place of journey : " + place);
							System.out.println("Date of the journey : " + date_of_BCJourney);
							System.out.println("Number of passangers : " + no_of_Passengers);
						
								if(no_of_Passengers > 0 && no_of_Passengers <=3 ) {
									System.out.println("Total price : Rs." + price_DBS_miniPackage);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 10) {
									System.out.println("Total price : Rs." + price_DBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 20) {
									System.out.println("Total price : Rs." + 2*price_DBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 30) {
									System.out.println("Total price : Rs." + 3*price_DBS_Package);
								}
								System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
								System.out.println("Thank You & See You Again!");
							System.out.println("\n\n*********************************************************");
						}
						
						else if (boatLocationsNumber == 3) {
							String place = "Beira Lake";
							double price_BLBS_miniPackage = 5000;
							double price_BLBS_Package = 11000;
						
							System.out.println("*********************************************************\n\n");
							System.out.println("Beira Lake Passanger Boat Service");
							System.out.println("\nCustomer Name : " + name_BCJourney);
							System.out.println("Place of journey : " + place);
							System.out.println("Date of the journey : " + date_of_BCJourney);
							System.out.println("Number of passangers : " + no_of_Passengers);
						
								if(no_of_Passengers > 0 && no_of_Passengers <=3 ) {
									System.out.println("Total price : Rs." + price_BLBS_miniPackage);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 10) {
									System.out.println("Total price : Rs." + price_BLBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 20) {
									System.out.println("Total price : Rs." + 2*price_BLBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 30) {
									System.out.println("Total price : Rs." + 3*price_BLBS_Package);
								}
								System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
								System.out.println("Thank You & See You Again!");
							System.out.println("\n\n*********************************************************");
						}
						
						else if(boatLocationsNumber == 4) {
							String place = "Gregory Lake";
							double price_GBS_miniPackage = 3500;
							double price_GBS_Package = 10000;
						
							System.out.println("*********************************************************\n\n");
							System.out.println("Gregory Boat Service");
							System.out.println("\nCustomer Name : " + name_BCJourney);
							System.out.println("Place of journey : " + place);
							System.out.println("Date of the journey : " + date_of_BCJourney);
							System.out.println("Number of passangers : " + no_of_Passengers);
						
								if(no_of_Passengers > 0 && no_of_Passengers <=3 ) {
									System.out.println("Total price : Rs." + price_GBS_miniPackage);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 10) {
									System.out.println("Total price : Rs." + price_GBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 20) {
									System.out.println("Total price : Rs." + 2*price_GBS_Package);
								}
								else if(no_of_Passengers > 0 && no_of_Passengers <= 30) {
									System.out.println("Total price : Rs." + 3*price_GBS_Package);
								}
								System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
								System.out.println("Thank You & See You Again!");
							System.out.println("\n\n*********************************************************");
						}
						else {
							System.out.println("Invalid Input!!");
							return Aquatic_Services_Boat();
						}
					}
			}
			//System.out.println("Thank You!");
			
		//}
		return "Thank You!";
	}

}
