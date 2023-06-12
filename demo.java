pacakage client;
public class demo{
	public static void main (String args[]){
		jaguar myCar = new jaguar(111212121, "Jaguar XJ");
		jaguar mySecondCar = new jaguar(12062021, "Jaguar AX");	

		myCar.display();
		myCar.getName();
	
		
		
		System.out.println(myCar.getManufacturer());
		System.out.println(myCar.getNoofwheels());

		//System.out.println(mySecondCar.getNoofwheels());

		System.out.println(myCar.getNoofwheels());
		jaguar.addWheels();
		System.out.println(myCar.getNoofwheels());

		// Demo for array
		
		String myCarNames[] = new String[2];
		myCarNames[0] = myCar.getName();
		myCarNames[1] = mySecondCar.getName();
		
		
		for(int i = 0; i < myCarNames.length; i++){
			System.out.println(myCarNames[i]);
		}
		
	}
}