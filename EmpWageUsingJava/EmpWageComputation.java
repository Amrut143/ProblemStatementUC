/**
*Employee wage computation program
*@author:Amrut
*/
import java.util.Random;
public class EmpWageComputation 
{
	//main method
	public static void main(String[] args) 
	{
		int attend;
		System.out.println("Welcome to employee wage computation");

		//instantiating EmpUtil class
		EmpUtil eu=new EmpUtil();
		Random ran=new Random();
		attend=ran.nextInt(2);

		//calling checkAttendance method
		eu.checkAttendance(attend);
	}
}

//Employee utility class
class EmpUtil
{
	int attendance;
	//method to check employee attendance
	public void checkAttendance(int attendance)
	{
		this.attendance = attendance;
		if(this.attendance==0)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	   }
	}