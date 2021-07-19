package seaplanetransportservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration sPlaneReg ;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Seaplane Transport Service Started");
		sPlaneInterface sPlaneInt = new sPlaneClass();
		sPlaneReg = bundleContext.registerService(sPlaneInterface.class.getName(),sPlaneInt,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Seaplane Transport Service Stopped");
		sPlaneReg.unregister();
	}

}
