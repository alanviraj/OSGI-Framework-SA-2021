package rentalcustomer;


import airtransportservice.airTransportInterface;
import boatship.BoatShipInterface;
import helicoptertransportservice.heliInterface;
import inlandservices.inlandServicesInterface;
import oceanicservices.oceanicServicesInterface;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import privatejettransportservice.pJetInterface;
import rentalbicycleservice.RentalBicycleService;
import rentalfootbicycle.RentalFootBicyclePublisher;
import rentallandservice.RentalLandPublish;
import rentalmoterbike.RentalMoterBikePublish;
import rentalservice.RentalPublish;
import rentalservice.RentalPublishImpl;
import seaplanetransportservice.sPlaneInterface;

public class Activator implements BundleActivator {

	ServiceReference customerService,landService,airService,airHelicopter,airSeaPlane,airJet,aquaticService,aquaticOcean,
	aquaticInland,bicycleService,bicycleFoot,bicycleMotor;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Rental Customer started...");
		customerService = context.getServiceReference(RentalPublish.class.getName());
		RentalPublish rentalPublish= (RentalPublish)context.getService(customerService);
		System.out.println(rentalPublish.publishRentalService());
		
		int select = rentalPublish.selectRentalService(),selection;
		
		if(select == 1) {
			
			landService = context.getServiceReference(RentalLandPublish.class.getName());
			RentalLandPublish rentalLandPublish = (RentalLandPublish)context.getService(landService);
			rentalLandPublish.landRental();
			
		}
		else if(select == 2) {
			
			airService = context.getServiceReference(airTransportInterface.class.getName());
			airTransportInterface airTransport = (airTransportInterface)context.getService(airService);
			int airResult = airTransport.airTransport(),air;
			
			if( airResult == 1) {
				airHelicopter = context.getServiceReference(heliInterface.class.getName());
				heliInterface heliTransport = (heliInterface)context.getService(airHelicopter);
				heliTransport.helicopterRental();
			}
			else if( airResult == 2) {
				airSeaPlane = context.getServiceReference(sPlaneInterface.class.getName());
				sPlaneInterface seaPlaneTransport = (sPlaneInterface)context.getService(airSeaPlane);
				seaPlaneTransport.seaPlaneRental();
			}
			else if( airResult == 3) {
				airJet = context.getServiceReference(pJetInterface.class.getName());
				pJetInterface pJetTransport = (pJetInterface)context.getService(airJet);
				pJetTransport.privateJetRental();
			}
			else {
				System.out.println("\nError...!\nInvalid Input...!!! ");
				airTransport.airTransport();
			}
		}
		else if(select == 3) {
	
			aquaticService = context.getServiceReference(BoatShipInterface.class.getName());
			BoatShipInterface aquaticTransport = (BoatShipInterface)context.getService(aquaticService);
			int aquaticResult = aquaticTransport.Method1(),aqua;
			
			if(aquaticResult == 1) {
				aquaticInland = context.getServiceReference(inlandServicesInterface.class.getName());
				inlandServicesInterface inlandTransport = (inlandServicesInterface)context.getService(aquaticInland);
				inlandTransport.Aquatic_Services_Boat();
			}
			else if(aquaticResult == 2) {
				aquaticOcean = context.getServiceReference(oceanicServicesInterface.class.getName());
				oceanicServicesInterface oceanTransport = (oceanicServicesInterface)context.getService(aquaticOcean);
				oceanTransport.Aquatic_Services_Ship();
			}
			else {
				System.out.println("\nError...!\nInvalid Input...!!! ");
				aquaticTransport.Method1();
			}
	
		}

		else if(select == 4) {
			
			bicycleService = context.getServiceReference(RentalBicycleService.class.getName());
			RentalBicycleService bicycleTransport = (RentalBicycleService)context.getService(bicycleService);
			int bicycleResult = bicycleTransport.rentalBicycle(),bicycle;
			
			if(bicycleResult == 1) {
				bicycleMotor = context.getServiceReference(RentalMoterBikePublish.class.getName());
				RentalMoterBikePublish motorTransport = (RentalMoterBikePublish)context.getService(bicycleMotor);
				motorTransport.rentalMoterBike();
			}
			else if(bicycleResult == 2) {
				bicycleFoot = context.getServiceReference(RentalFootBicyclePublisher.class.getName());
				RentalFootBicyclePublisher footTransport = (RentalFootBicyclePublisher)context.getService(bicycleFoot);
				footTransport.rentalFootBicycle();
			}
			else {
				System.out.println("\nError...!\nInvalid Input...!!! ");
				bicycleTransport.rentalBicycle();
			}
	
		}
		else {
			System.out.println("\nError...!\nInvalid Input...!!!\nPlease try again...!!!");
			rentalPublish.selectRentalService();
		}
		
	}

	public void stop(BundleContext context) throws Exception {
		context.ungetService(customerService);
		System.out.println("Rental Customer Stopped...");
		
	}

}
