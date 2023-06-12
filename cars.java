pacakage server;
public abstract class cars implements automobile{
	public int manufacturingDate;
	public String name;
	
	public void display(){}
	public abstract String getManufacturer();
	public String getName(){
	return name;	
}
	public int getManufacturingDate(){
		return manufacturingDate;

	}
}