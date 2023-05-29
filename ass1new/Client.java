import java.rmi.*;
import java.util.Scanner;



public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
			String serverURL = "rmi://localhost/Server";
			ServerIntf s = (ServerIntf) Naming.lookup(serverURL);
			
			System.out.print("Enter First num : ");
			int num1 = sc.nextInt();
			
			System.out.print("Enter Second num : ");
			int num2 = sc.nextInt();
			
			
		
			System.out.println("--------------- Results ---------------");
			System.out.println("Addition  Is: " + s.addition(num1, num2));
			
			
		}catch(Exception e){
			System.out.println("Exception Occurred At Client!" + e.getMessage());
		}
		
	}

}
