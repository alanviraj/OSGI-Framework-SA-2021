package seaplanetransportservice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sPlaneClass implements sPlaneInterface {

	@Override
	public String seaPlaneRental() {
		
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
		
		//if(typeNo == 2) {
			String conPlane = null;
			int sCharge = 0; 
			String destName = null;
			Scanner s2 = new Scanner(System.in);
			
			System.out.println("\nHere are some Travelling Destination from Colombo that we provide."
					+ "\n1.Batticaloa \n2.Koggala \n3.Dickwella (Tangalle) "
					+ "\n4.Kandy(Digana) \n5.Dambulla \n6.Nuwara-eliya \n7.Trincomalee");
			System.out.print("\nEnter the Destination Number :");
			int dest = s2.nextInt();
			
			if (dest >= 8 || dest <= 0) {
				System.out.print("\nInvalid Input\nBooking Canceled");
				return seaPlaneRental();
			}
			else if(dest == 1) {
				destName = "Batticaloa";
			}
			else if(dest == 2) {
				destName = "Koggala";
			}
			else if(dest == 3) {
				destName = "Dickwella (Tangalle)";
			}
			else if(dest == 4) {
				destName = "Kandy(Digana)";
			}
			else if(dest == 5) {
				destName = "Dambulla";
			}
			else if(dest == 6) {
				destName = "Nuwara-eliya";
			}
			else if(dest == 7) {
				destName = "Trincomalee";
			}	
			
			
			System.out.print("Enter number of Passengers :");
			int pass = s2.nextInt();
			
			if(pass > 7) {
				System.out.println("Maximum Passenger Capacity for a Seaplane is 7");
				float a = (float) (pass / 7.0) ;
				System.out.print("\nDo you want to book another "+(int)a+" plane/s(Y/N)?");
				conPlane = s2.next();
				
				if(conPlane.contentEquals("N") || conPlane.contentEquals("n")) {
					System.out.println("\nBooking Error!!!\nBooking Canceled");
					return seaPlaneRental();
				}
				else if(!conPlane.contentEquals("N") && !conPlane.contentEquals("n")) {
					if(!conPlane.contentEquals("Y") && !conPlane.contentEquals("y")) {
						System.out.println("\nInvalid Input!!!\nBooking Canceled");
						return seaPlaneRental();
					}
				}
				
			}
			else if(pass <= 7) {
				conPlane = "Y";
			}
			
			if (conPlane.contentEquals("Y") || conPlane.contentEquals("y")) {
				System.out.print("Do you want to book for return trip(Y/N)?");
				String rTrip = sc.next();
				
				if(dest == 2 || dest == 3) {
					if(rTrip.contentEquals("Y") || rTrip.contentEquals("y")) {
						sCharge = (pass * 7000) * 2;
					}
					else {
						sCharge = pass * 7000;
					}
				}
				else if (dest == 1 || dest == 7) {
					if(rTrip.contentEquals("Y") || rTrip.contentEquals("y")) {
						sCharge = (pass * 15000) * 2;
					}
					else {
						sCharge = pass * 15000;
					}
				}
				else if (dest == 4 || dest == 6) {
						if(rTrip.contentEquals("Y") || rTrip.contentEquals("y")) {
							sCharge = (pass * 10000) * 2;
						}
						else {
							sCharge = pass * 10000;
						}
				}
				else if (dest == 5) {
						if(rTrip.contentEquals("Y") || rTrip.contentEquals("y")) {
							sCharge = (pass * 11000) * 2;
						}
						else {
							sCharge = pass * 11000;
						}
				}
				
				System.out.println("\n********************************************");
				System.out.println("\tBOOKING DETAILS\n");
				System.out.println("Customer Name : "+custName+"\nContact Number : "+custPNo+"\nTravelling Date : "+travelDate
						+ "\nAircraft : Seaplane\nNumber of Pasengers : "+pass+"\nDestination : "+destName+"\nTotal Charge : "+sCharge+"LKR\n");
				
			}
			
			
		//}
		
		return "Thank You";
	}

}
