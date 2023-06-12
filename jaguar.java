pacakage server;
public class jaguar extends cars{
	public static int noofwheels = 4;
			
	public jaguar (int manufacturingDate, String name){
		this.manufacturingDate = manufacturingDate;
		this.name=name;
}
	public void display(){
		System.out.println("Name of the car is:"+ name);
		System.out.println("manufacturing date is:"+ manufacturingDate);

}
public String getManufacturer(){
	return nameManufacturer;
}
	public String getName(){
		return name;
	}

	public int getNoofwheels(){
	return noofwheels;
	}
	public static int addWheels(){
		jaguar.noofwheels++;
		return noofwheels;
}

	public int getManufacturingDate(){
		return manufacturingDate;

	}


}