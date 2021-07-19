package privatejettransportservice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pJetClass implements pJetInterface {

	@Override
	public String privateJetRental() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Your Name :");
		String custName = sc.next();
		
		System.out.print("\nEnter Your Contact Number :");
		String custPNo = sc.next();
		
		String regex = "\\d{10}";
	    Pattern patt = Pattern.compile(regex);
	    Matcher match = patt.matcher(custPNo);
	    
	    while(!(match.matches())) {
	    	
	    	System.out.println("\nInvalid Contact Number!!!");
	    	
	    	System.out.print("\nEnter Your Contact Number :");
			custPNo = sc.next();
			match = patt.matcher(custPNo);
	    }
	    
		
		System.out.print("\nEnter The Travelling Date(DD-MM-YYYY) :");
		String travelDate = sc.next();
		String regex2 = "\\d{1,2}-\\d{1,2}-\\d{4}";
		
		while(!(travelDate.matches(regex2))) {
	    	
	    	System.out.println("\nInvalid Date!!!");
	    	
			System.out.print("\nEnter The Travelling Date(DD-MM-YYYY) :");
			travelDate = sc.next();
	    }

		//if(typeNo == 3) {
			int jCharge = 0;
			String passpo = null;
			String dest = null;
			Scanner s3 = new Scanner(System.in);
			
			System.out.println("*****In Our Travel Services you can rent Private Jet for International Trip but for Local Trip Jet can be booked for a Specific Location only. *****");
			System.out.println("Is it a International or Local Trip(I/L)?");
			String tr = s3.next();
			
			if (tr.contentEquals("I") || tr.contentEquals("i")) {
				System.out.print("Enter the Passport Number :");
				passpo = s3.next();
				
				System.out.println("Here are Continents with Type Numbers."
						+ "\n\t1 - Asia\n\t2 - Africa\n\t3 - Australasia\n\t4 - Europe"
						+ "\n\t5 - North America\n\t6 - South America");
				
				System.out.print("\nEnter relevant Continent Number :");
				int conti = s3.nextInt();
				
				if (conti >= 7 || conti <= 0) {
					System.out.print("\nInvalid Input\nBooking Canceled");
					return privateJetRental();
				}
				
				System.out.println("\n*****Maximum Passenger per Private Jet is 20*****\n");
				
				System.out.print("Enter the Number of Days for Renting :");
				int jDays = s3.nextInt();
				
				if(conti == 1 || conti == 3) {
					if(conti == 1) {
						dest = "Asia";
					}
					else {
						dest = "Australasia";
					}
					jCharge = jDays * 2000000;
				}
				else if(conti == 2 || conti == 4) {
					if(conti == 2) {
						dest = "Africa";
					}
					else {
						dest = "Europe";
					}
					jCharge = jDays * 3000000;
				}
				else if(conti == 5 || conti == 6) {
					if(conti == 5) {
						dest = "North America";
					}
					else {
						dest = "South America";
					}
					jCharge = jDays * 4000000;
				}
				
				System.out.println("\n********************************************");
				System.out.println("\t\tBOOKING DETAILS\n");
				System.out.println("Customer Name : "+custName+"\nContact Number : "+custPNo+"\nTravelling Date : "+travelDate
						+ "\nAircraft : Priavte Jet\nNumber of Days Rented: "+jDays+"\nDestination : "+dest+"\nTotal Charge : "+jCharge+"LKR\n");
				
			}
			else if (tr.contentEquals("L") || tr.contentEquals("l")) {
				System.out.println("Here are some Travelling Destination from Colombo that we provide."
						+ "\n\t1.Jaffna \n\t2.Mattala \n\t3.Batticaloa \n\t4.Sigiriya \n\t5.Trincomalee");
				
				System.out.print("Enter the Destination Number :");
				int destNo = s3.nextInt();
				
				if (destNo >= 6 || destNo <= 0) {
					System.out.print("\nInvalid Input\nBooking Canceled");
					return privateJetRental();
				}
				
				System.out.print("Enter the Number of Passengers :");
				int passe = s3.nextInt();
				
				if(destNo == 1 || destNo == 5) {
					if (destNo == 1) {
						dest = "Jaffna";
					}
					else {
						dest = "Trincomalee";
					}
					jCharge = passe *18000;
				}
				else if(destNo == 2 || destNo == 3) {
					if (destNo == 2) {
						dest = "Mattala";
					}
					else {
						dest = "Batticaloa";
					}
					jCharge = passe *13000;
				}
				else if(destNo == 4) {
					dest = "Sigiriya";
					jCharge = passe *8000;
				}
				
				System.out.println("\n********************************************");
				System.out.println("\tBOOKING DETAILS\n");
				System.out.println("Customer Name : "+custName+"\nContact Number : "+custPNo+"\nTravelling Date : "+travelDate
						+ "\nAircraft : Priavte Jet\nNumber of Pasengers : "+passe+"\nDestination : "+dest+"\nTotal Charge : "+jCharge+"LKR\n");
			}
			else {
				System.out.println("\nError!!!");
				System.out.println("Invalid Input\nBooking Canceled");
				return privateJetRental();
			}
		//}
		
		return "Thank You";
	}

}
