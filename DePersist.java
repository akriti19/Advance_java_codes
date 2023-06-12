import java.io.*;
class DePersist{
 public static void main(String args[])throws Exception{
  
  
  FileInputStream in = new FileInputStream("f1.txt");
  ObjectInputStream fin=new ObjectInputStream(in);

  Student s=(Student)fin.readObject();
  System.out.println(s.id+" "+s.name);

  in.close();
 }
}