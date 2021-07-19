package rentalfootbicycle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Foot Bicycle service started.");
		RentalFootBicyclePublisher bicyclePublisher = new RentalFootBicyclePublisherImp();
		serviceRegistration = bundleContext.registerService(RentalFootBicyclePublisher.class.getName(), bicyclePublisher, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Foot Bicycle service stoped.");
		serviceRegistration.unregister();
	}

}
