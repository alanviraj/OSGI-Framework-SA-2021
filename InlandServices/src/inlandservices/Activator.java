package inlandservices;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration InlandRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Inland Boat Serivces Started...");
		inlandServicesInterface inlandregistration = new inlandServicesClass();
		InlandRegistration = context.registerService(inlandServicesInterface.class.getName(), inlandregistration, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Inland Boat Serivces Stopped...");
		InlandRegistration.unregister();
	}

}
