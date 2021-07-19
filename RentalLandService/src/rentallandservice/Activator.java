package rentallandservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishlandRental;


	public void start(BundleContext context) throws Exception {
		
		System.out.println("Land Rental Service Started...");		
		RentalLandPublish rentalLandPublisher = new RentalLandPublishImpl();
		publishlandRental = context.registerService(RentalLandPublish.class.getName(), rentalLandPublisher,null);	
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Land Rental Service Stopped...");
		publishlandRental.unregister();
	}

}