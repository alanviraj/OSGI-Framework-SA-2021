package oceanicservices;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration OceanicRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Oceanic Cruise Serivces Started...");
		oceanicServicesInterface oceanicregistration = new oceanicServicesClass();
		OceanicRegistration = context.registerService(oceanicServicesInterface.class.getName(), oceanicregistration, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Oceanic Cruise Serivces Stopped...");
		OceanicRegistration.unregister();
	}

}
