package rentalmoterbike;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Moter bike service started.");
		RentalMoterBikePublish bikePublish = new RentalMoterBikePublishImp();
		serviceRegistration = bundleContext.registerService(RentalMoterBikePublish.class.getName(), bikePublish, null);
	}
	
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Moter bike service stoped.");
		serviceRegistration.unregister();
	}

}
