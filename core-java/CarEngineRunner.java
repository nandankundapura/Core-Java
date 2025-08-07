class CarEngineRunner {
	
public static void main(String[] args) {
 Car2 car=new Car2("BMW",4,"black","A","petrol");

Engine enhine=new Engine(12345,"Turbo","S500");
car2.setEngine(engine);

System.out.println("Print car details");
System.out.println(Car2.getName);
System.out.println(Car2.getWheels);
System.out.println(Car2.getColor);
System.out.println(Car2.getFeatures);
System.out.println(Car2.getFueltype);	


System.out.println("******Car Engine Details******");
System.out.println(engine.getEngineName());
System.out.println(engine.getEngineType());
System.out.println(engine.getEngineCC());
}
}