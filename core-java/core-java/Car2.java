class Car2 {
 	private String name;
	private int wheels;
	private String color;
	private String features;
	private String fuelType;
	private Engine engine; 
 
public Car2(String name,int wheels, String color, String features, String fuelType) {
 	this.name=name;
	this.wheels=wheels;
	this.color=color;
	this.features=features;
	this.fuelType=fuelType;
}
public Car2(String name, int wheels, String color, String features, String fuelType, Engine engine) {
	this(name,wheels,color,features,fuelType);
	this.engine=engine;
}
public void setEngine(Engine engine) {
	this.engine=engine;
}
public Engine getEngine() {
	return engine;
}
public String getName() {
	return name;
}
public int getWheels() {
	return wheels;
}
public String getColor() {
	return color;
}
public String getFeatures() {
	return features;
}
public String fuelType() {
	return fuelType;
}
}

