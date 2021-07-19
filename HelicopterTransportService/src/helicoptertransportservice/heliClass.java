package helicoptertransportservice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class heliClass implements heliInterface {

	@Override
	public String helicopterRental() {
		
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
		
		//if(typeNo == 1) {
			int heliType = 0;
			int hCharge = 0;
			int days = 0;
			int hours = 0;
			String heliName = null;
			String destName = null;
			Scanner s1 = new Scanner(System.in);
			
			System.out.println("\nHere are some different types of Helicopter. "
					+ "\n\t Type 1 : ROBINSON R22"
					+ "\n\t          Passenger Capacity : 2"
					+ "\n\t          Max Payload : 635KG\n"
					+ "\n\t Type 2 : EUROCOPTER EC135T1/T2"
					+ "\n\t          Passenger Capacity : 6"
					+ "\n\t          Max Payload : 2,720~2,835KG\n"
					+ "\n\t Type 3 : SIKORSKY S-76C+/C++"
					+ "\n\t          Passenger Capacity : 12"
					+ "\n\t          Max Payload : 5307KG\n"
					+ "\n\t Type 4 : AEROSPATIALE AS350B3 ECUREUIL"
					+ "\n\t          Passenger Capacity : 21"
					+ "\n\t          Max Payload : 2250KG\n");
			
			System.out.print("\nEnter the Helicopter Type Number :");
			heliType = s1.nextInt();
			
			if (heliType >= 5 || heliType <= 0) {
				System.out.print("\nInvalid Input\nBooking Canceled");
				return helicopterRental();
			}
			
			System.out.println("\nHere are some Destination that we provide."
					+ "\n1.Arugumbay \n2.Koggala \n3.Hatton(Norwood) "
					+ "\n4.Jaffna \n5.Kandy(Digana) \n6.Minneriya \n7.Nuwara-eliya "
					+ "\n8.Sigiriya \n9.Trincomale \n10.Yala");
			System.out.print("\nEnter the Destination Number :");
			int dest = s1.nextInt();
			
			if (dest >= 11 || dest <= 0) {
				System.out.print("\nInvalid Input\nBooking Canceled");
				return helicopterRental();
			}
			else if(dest == 1) {
				destName = "Arugumbay";
			}
			else if(dest == 2) {
				destName = "Koggala";
			}
			else if(dest == 3) {
				destName = "Hatton(Norwood)";
			}
			else if(dest == 4) {
				destName = "Jaffna";
			}
			else if(dest == 5) {
				destName = "Kandy(Digana)";
			}
			else if(dest == 6) {
				destName = "Minneriya";
			}
			else if(dest == 7) {
				destName = "Nuwara-eliya";
			}
			else if(dest == 8) {
				destName = "Sigiriya";
			}
			else if(dest == 9) {
				destName = "Trincomale";
			}
			else if(dest == 10) {
				destName = "Yala";
			}
			
			
			System.out.println("\nType of Helicopter Renting Methods."
					+ "\n\t Type 1: Renting By Number of Days"
					+ "\n\t Type 2: Renting By Number of Hours"
					+ "\n\t Type 3: Renting For a Specfic Location");
			System.out.print("\nEnter the Helicopter Renting Type Number :");
			int rentHType = s1.nextInt();
			
			if(rentHType == 1) {
				System.out.print("\nEnter the Number Of Days for Renting :");
				days = s1.nextInt();
			}
			else if(rentHType == 2) {
				System.out.print("\nEnter the Number Of Hours for Renting :");
				hours = s1.nextInt();
			}
			else if (rentHType != 1 || rentHType != 2 || rentHType != 3) {
				System.out.print("\nInvalid Input\nBooking Canceled");
				return helicopterRental();
			}
			
			
			if(heliType == 1) {
				
				heliName = "ROBINSON R22";
				
				if(rentHType == 1) {
					hCharge = days * 300000;
				}
				else if(rentHType == 2) {
					hCharge = hours * 12500;
				}
				else if(rentHType == 3) {
					
					if(dest == 3 || dest == 5 || dest == 7) {
						hCharge = 15000;
					}
					else if (dest == 1 || dest == 10) {
						hCharge = 32000;
					}
					else if (dest == 2) {
						hCharge = 14000;
					}
					else if (dest == 4 || dest == 9) {
						hCharge = 40000;
					}
					else if (dest == 6 || dest == 8) {
						hCharge = 17000;
					}
					
				}
			}
			else if(heliType == 2) {
				
				heliName = "EUROCOPTER EC135T1/T2";
				
				if(rentHType == 1) {
					hCharge = days * 600000;
				}
				else if(rentHType == 2) {
					hCharge = hours * 25000;
				}
				else if(rentHType == 3) {
					
					if(dest == 3 || dest == 5 || dest == 7) {
						hCharge = 30000;
					}
					else if (dest == 1 || dest == 10) {
						hCharge = 64000;
					}
					else if (dest == 2) {
						hCharge = 28000;
					}
					else if (dest == 4 || dest == 9) {
						hCharge = 80000;
					}
					else if (dest == 6 || dest == 8) {
						hCharge = 34000;
					}
					
				}
				
			}
			else if(heliType == 3) {
				
				heliName = "SIKORSKY S-76C+/C++";
				
				if(rentHType == 1) {
					hCharge = days * 1200000;
				}
				else if(rentHType == 2) {
					hCharge = hours * 50000;
				}
				else if(rentHType == 3) {
					
					if(dest == 3 || dest == 5 || dest == 7) {
						hCharge = 60000;
					}
					else if (dest == 1 || dest == 10) {
						hCharge = 128000;
					}
					else if (dest == 2) {
						hCharge = 56000;
					}
					else if (dest == 4 || dest == 9) {
						hCharge = 160000;
					}
					else if (dest == 6 || dest == 8) {
						hCharge = 68000;
					}
					
				}
				
			}
			else if(heliType == 4) {
				heliName = "AEROSPATIALE AS350B3 ECUREUIL";
				
				if(rentHType == 1) {
					hCharge = days * 2000000;
				}
				else if(rentHType == 2) {
					hCharge = hours * 90000;
				}
				else if(rentHType == 3) {
					
					if(dest == 3 || dest == 5 || dest == 7) {
						hCharge = 100000;
					}
					else if (dest == 1 || dest == 10) {
						hCharge = 240000;
					}
					else if (dest == 2) {
						hCharge = 100000;
					}
					else if (dest == 4 || dest == 9) {
						hCharge = 300000;
					}
					else if (dest == 6 || dest == 8) {
						hCharge = 120000;
					}
					
				}
			}
			System.out.println("\n*********************************************");
			System.out.println("\tBOOKING DETAILS\n");
			if(rentHType == 1) {
				System.out.println("Customer Name : "+custName+"\nContact Number : "+custPNo+"\nTravelling Date : "+travelDate
						+ "\nAircraft : Helicopter\nHelicopter Type : "+heliName+"\nDestination : "+destName+"\nRented Days : "+days+"\nTotal Charge : "+hCharge+"LKR\n");
			}
			else if(rentHType == 2) {
				System.out.println("Customer Name : "+custName+"\nContact Number : "+custPNo+"\nTravelling Date : "+travelDate
						+ "\nAircraft : Helicopter\nHelicopter Type : "+heliName+"\nDestination : "+destName+"\nRented Hours : "+hours+"\nTotal Charge : "+hCharge+"LKR\n");
			}
			else if(rentHType == 3) {
				System.out.println("Customer Name : "+custName+"\nContact Number : "+custPNo+"\nTravelling Date : "+travelDate
						+ "\nAircraft : Helicopter\nHelicopter Type : "+heliName+"\nDestination : "+destName+"\nTotal Charge : "+hCharge+"LKR\n");
			}
			
		//}
		
		return "Thank You";
	}

}
