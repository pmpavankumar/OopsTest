package Test;
import java.util.Scanner;
class Employee
{
	private  String firstName;
	private  String lastName;
	
	public Employee(String f,String l)
	{
		this.lastName = l;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String toString()
	{
		return String.format("%s: %s %s%n%s: %s","employee",getFirstName(),getLastName());
	}
}
class HourlyEmployee extends Employee
{
	public HourlyEmployee(String fn,String ln)
	{
		super(fn,ln);
	}
}
public class Employeee {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the first name:");
		String firstName = scanner.next();
		System.out.print("enter the last name:");
		String lastName = scanner.next();
		
		HourlyEmployee emp = new HourlyEmployee(firstName,lastName);
		System.out.print(emp.toString());
		
		
	}

}
