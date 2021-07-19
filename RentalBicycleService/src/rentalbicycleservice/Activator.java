package rentalbicycleservice;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import rentalfootbicycle.RentalFootBicyclePublisher;
import rentalmoterbike.RentalMoterBikePublish;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Rental Bicycle Service started !");
		RentalBicycleService bicycleService = new RentalBicycleServiceImp();
		serviceRegistration = bundleContext.registerService(RentalBicycleService.class.getName(),bicycleService, null);
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Rental Bicycle Service stoped !");
		serviceRegistration.unregister();
	}

}
