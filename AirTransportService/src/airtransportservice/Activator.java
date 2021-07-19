package airtransportservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration airReg ;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Air Transport Service Started");
		airTransportInterface AirTInt = new airTransportClass();
		airReg = bundleContext.registerService(airTransportInterface.class.getName(),AirTInt,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Air Transport Service Stopped");
		airReg.unregister();
	}

}
