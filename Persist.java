import java.io.*;

class Persist {
   public static void main(String args[]) {

   	try {
   		Employee emp = new Employee("Akshat",6969);

   		FileOutputStream fout = new FileOutputStream("fout.txt");

   		ObjectOutputStream out = new ObjectOutputStream(fout);

   		out.writeObject(emp);
   		out.flush();
   		out.close();
   		System.out.println("Serialization successful!");
   	}
       
   	catch (Exception e){
   		System.out.println(e);
   	}
   }
}
