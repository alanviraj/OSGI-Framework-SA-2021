package rentalservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publishRental;

	
	public void start(BundleContext context) throws Exception {
		System.out.println("Rental Service Started...");		
		RentalPublish rentalPublisher = new RentalPublishImpl();
		publishRental = context.registerService(RentalPublish.class.getName(), rentalPublisher,null);	
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Transport Service Stopped...");
		publishRental.unregister();
	}

}
