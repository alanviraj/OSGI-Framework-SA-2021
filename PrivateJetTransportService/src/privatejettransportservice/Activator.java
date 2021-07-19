package privatejettransportservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration pJetReg ;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Private Jet Transport Service Started");
		pJetInterface jetInt = new pJetClass();
		pJetReg = bundleContext.registerService(pJetInterface.class.getName(),jetInt,null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Private Jet Transport Service Stopped");
		pJetReg.unregister();
	}

}
