package helicoptertransportservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration HeliReg ;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Helicopter Transport Service Started");
		heliInterface heliInt = new heliClass();
		HeliReg = bundleContext.registerService(heliInterface.class.getName(),heliInt,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Helicopter Transport Service Stopped");
		HeliReg.unregister();
	}

}
