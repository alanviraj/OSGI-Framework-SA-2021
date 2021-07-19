package oceanicservices;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class oceanicServicesClass implements oceanicServicesInterface {

	@Override
	public String Aquatic_Services_Ship() {
		
		String start = null;
		String end = null;
		
		//System.out.println("\n                         Hello welcome to Aquatic Transport Services(Boats & Cruises).");
		Scanner select = new Scanner(System.in);
		
		//System.out.println("We provide 2 types of services \n 1.Inland Services \n 2.Oceanic Cruise Services");
		//System.out.println("For Inland Services Enter 1 & For Oceanic Cruise Services Enter 2");
		//System.out.println("Enter The Number : ");
		//int typeNumber = select.nextInt(); 
		
		//if(typeNumber == 2) {
			System.out.println("\n                         Welcome To Oceanic Cruises Services.");
			
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
			
			System.out.println("Below are the places where we pick up and drop are customers"
					+ "\n 1 -> Colombo (Port of Colombo)"
					+ "\n 2 -> Hambantota (Port of Hambantota)"
					+ "\n 3 -> Trincomalee (Trincomalee Harbour)"
					+ "\n 4 -> Galle (Port of Galle)");
			System.out.println("Enter the beginning place of the journey(Enter the number from above) : ");
			int shipStartingPlace = select.nextInt();
			
				if(shipStartingPlace == 1) {
					start = "Colombo (Port of Colombo)";
				}
				else if(shipStartingPlace == 2) {
					start = "Hambantota (Port of Hambantota)";
				}
				else if(shipStartingPlace == 3) {
					start = "Trincomalee (Trincomalee Harbour)";
				}
				else if(shipStartingPlace == 4) {
					start = "Galle (Port of Galle)";
				}
			
			System.out.println("Enter the destination place(Enter the number from above) : ");
			int shipEndingPlace = select.nextInt();
			
				if(shipEndingPlace == 1) {
					end = "Colombo (Port of Colombo)";
				}
				else if(shipEndingPlace == 2) {
					end = "Hambantota (Port of Hambantota)";
				}
				else if(shipEndingPlace == 3) {
					end = "Trincomalee (Trincomalee Harbour)";
				}
				else if(shipEndingPlace == 4) {
					end = "Galle (Port of Galle)";
				}
			
			if (shipStartingPlace == shipEndingPlace) {
				System.out.println("You cannot enter the same place for beginning and the destination out field!! ");
				return Aquatic_Services_Ship();
			}
			
			else if(shipStartingPlace > 4 || shipEndingPlace > 4 || shipStartingPlace <= 0 || shipEndingPlace <= 0) {
				System.out.println("You have inputted an incorrect number!!");
				return Aquatic_Services_Ship();
			}
			
			else {
				System.out.println("\nEnter the number of passengers who are travelling for this journey : ");
				int no_of_Passengers = select.nextInt();
				
				if(no_of_Passengers < 10) {
					System.out.println("We do not provide Cruise Services for less than 10 passengers");
					return Aquatic_Services_Ship();
				}
				else if(no_of_Passengers > 50) {
					System.out.println("We allow only 50 passengers for a journey");
					return Aquatic_Services_Ship();
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
					
					if ((shipStartingPlace == 1 || shipStartingPlace == 2) && (shipEndingPlace == 2 || shipEndingPlace == 1)) {
						
						String colombo = "Colombo";
						String hambantota = "Hambantota";
						String trincomalee = "Trincomalee";
						String galle = "Galle";
						
						System.out.println("*********************************************************\n\n");
						System.out.println("Oceanic Cruises Services");
						System.out.println("\nCustomer Name : " + name_BCJourney);
						System.out.println("Starting Place : " + start);
						System.out.println("Ending Place : " + end);
						System.out.println("Date of the journey : " + date_of_BCJourney);
						System.out.println("Number of passangers : " + no_of_Passengers);
					
						if (no_of_Passengers <= 20) {
							double miniPackage = 40000;
							System.out.println("Total price : Rs." + miniPackage);
						}
						else if (no_of_Passengers > 20 && no_of_Passengers <= 50) {
							double mainPackage = 55000;
							System.out.println("Total price : Rs." + mainPackage);
						}
						System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
						System.out.println("Thank You & See You Again!");
						System.out.println("\n\n*********************************************************");
						
					}
					
					else if ((shipStartingPlace == 1 || shipStartingPlace == 3) && (shipEndingPlace == 3 || shipEndingPlace == 1)) {
						System.out.println("*********************************************************\n\n");
						System.out.println("Oceanic Cruises Services");
						System.out.println("\nCustomer Name : " + name_BCJourney);
						System.out.println("Starting Place : " + start);
						System.out.println("Ending Place : " + end);
						System.out.println("Date of the journey : " + date_of_BCJourney);
						System.out.println("Number of passangers : " + no_of_Passengers);
					
						if (no_of_Passengers <= 20) {
							double miniPackage = 65000;
							System.out.println("Total price : Rs." + miniPackage);
						}
						else if (no_of_Passengers > 20 && no_of_Passengers <= 50) {
							double mainPackage = 80000;
							System.out.println("Total price : Rs." + mainPackage);
						}
						System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
						System.out.println("Thank You & See You Again!");
						System.out.println("\n\n*********************************************************");
					}
					
					else if ((shipStartingPlace == 1 || shipStartingPlace == 4) && (shipEndingPlace == 4 || shipEndingPlace == 1)) {
						System.out.println("*********************************************************\n\n");
						System.out.println("Oceanic Cruises Services");
						System.out.println("\nCustomer Name : " + name_BCJourney);
						System.out.println("Starting Place : " + start);
						System.out.println("Ending Place : " + end);
						System.out.println("Date of the journey : " + date_of_BCJourney);
						System.out.println("Number of passangers : " + no_of_Passengers);
					
						if (no_of_Passengers <= 20) {
							double miniPackage = 20000;
							System.out.println("Total price : Rs." + miniPackage);
						}
						else if (no_of_Passengers > 20 && no_of_Passengers <= 50) {
							double mainPackage = 35000;
							System.out.println("Total price : Rs." + mainPackage);
						}
						System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
						System.out.println("Thank You & See You Again!");
						System.out.println("\n\n*********************************************************");
					}
					
					else if ((shipStartingPlace == 2 || shipStartingPlace == 3) && (shipEndingPlace == 3 || shipEndingPlace == 2)) {
						System.out.println("*********************************************************\n\n");
						System.out.println("Oceanic Cruises Services");
						System.out.println("\nCustomer Name : " + name_BCJourney);
						System.out.println("Starting Place : " + start);
						System.out.println("Ending Place : " + end);
						System.out.println("Date of the journey : " + date_of_BCJourney);
						System.out.println("Number of passangers : " + no_of_Passengers);
					
						if (no_of_Passengers <= 20) {
							double miniPackage = 40000;
							System.out.println("Total price : Rs." + miniPackage);
						}
						else if (no_of_Passengers > 20 && no_of_Passengers <= 50) {
							double mainPackage = 55000;
							System.out.println("Total price : Rs." + mainPackage);
						}
						System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
						System.out.println("Thank You & See You Again!");
						System.out.println("\n\n*********************************************************");
					}
					
					else if ((shipStartingPlace == 2 || shipStartingPlace == 4) && (shipEndingPlace == 4 || shipEndingPlace == 2)) {
						System.out.println("*********************************************************\n\n");
						System.out.println("Oceanic Cruises Services");
						System.out.println("\nCustomer Name : " + name_BCJourney);
						System.out.println("Starting Place : " + start);
						System.out.println("Ending Place : " + end);
						System.out.println("Date of the journey : " + date_of_BCJourney);
						System.out.println("Number of passangers : " + no_of_Passengers);
					
						if (no_of_Passengers <= 20) {
							double miniPackage = 30000;
							System.out.println("Total price : Rs." + miniPackage);
						}
						else if (no_of_Passengers > 20 && no_of_Passengers <= 50) {
							double mainPackage = 45000;
							System.out.println("Total price : Rs." + mainPackage);
						}
						System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
						System.out.println("Thank You & See You Again!");
						System.out.println("\n\n*********************************************************");
					}
					else if ((shipStartingPlace == 3 || shipStartingPlace == 4) && (shipEndingPlace == 4 || shipEndingPlace == 3)) {
						System.out.println("*********************************************************\n\n");
						System.out.println("Oceanic Cruises Services");
						System.out.println("\nCustomer Name : " + name_BCJourney);
						System.out.println("Starting Place : " + start);
						System.out.println("Ending Place : " + end);
						System.out.println("Date of the journey : " + date_of_BCJourney);
						System.out.println("Number of passangers : " + no_of_Passengers);
					
						if (no_of_Passengers <= 20) {
							double miniPackage = 55000;
							System.out.println("Total price : Rs." + miniPackage);
						}
						else if (no_of_Passengers > 20 && no_of_Passengers <= 50) {
							double mainPackage = 70000;
							System.out.println("Total price : Rs." + mainPackage);
						}
						System.out.println("\nOne of our instructor will contact this "+number_BCJourney+ " number.");
						System.out.println("Thank You & See You Again!");
						System.out.println("\n\n*********************************************************");
					}
				}
			}
		//}
		return "Thank You";
	}
	
}
