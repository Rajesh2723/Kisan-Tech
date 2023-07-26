package SerialLi_deserial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialixaion {

	public static void main(String[] args) {
		try(FileInputStream f=new FileInputStream("emp.dat");
				ObjectInputStream in=new ObjectInputStream(f)){
			
			Employee e1=(Employee) in.readObject();
			System.out.println(e1.getName());
			System.out.println(e1.getSal());
			 
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
