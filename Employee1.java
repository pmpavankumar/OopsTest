package Test;
import java.util.Scanner;

public class Employee1 {
		private String firstName;
		private String lastName;


		public Employee1(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		@Override
		public String toString() {
			return "Employee1 [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		public static void main(String[] args) {
			Scanner scc = new Scanner(System.in);
			
	    try {
	    	Employee1 e1= new Employee1("Pavan","kumar");
	    	
	    	System.out.println(e1);
	    	
	    }
	    catch(NullPointerException n) {
	    	
	    	System.out.println("please enter firstname and lastname properly");
	    	
	    }
		}
	   
	    void NullPointer(int String) throws Exception
		{
			if(String>3)
			{
				throw new Exception("Entry missing");
			}
			else
			{
				 System.out.println("FirstName and Lastname Properly");
			}
		}
}

