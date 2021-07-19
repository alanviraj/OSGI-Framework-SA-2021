package boatship;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

//import rentalservice.RentalPublish;
//import rentalservice.RentalPublishImpl;
//import rentalservice.RentalPublish;
//import rentalservice.RentalPublish;
//import rentalservice.RentalPublishImpl;


public class Activator implements BundleActivator {

	ServiceRegistration Boat_Ship_Registration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Boat & Ship Implementation Started...");
		BoatShipInterface boatship = new BoatShipClass();
		Boat_Ship_Registration = context.registerService(BoatShipInterface.class.getName(), boatship,null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Boat & Ship Implementation Stopped...");
		Boat_Ship_Registration.unregister();
		
	}

}
