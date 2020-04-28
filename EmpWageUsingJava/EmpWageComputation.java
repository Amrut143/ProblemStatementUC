/**
* Employee wage computation program
* @author: Amrut
*/
import java.util.Random;

public class EmpWageComputation {
		//main method
      public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
         //create EmpUtil object
      final EmpUtil emp=new EmpUtil();
		//call daily wage method
		System.out.println("Employee daily wage is"+emp.getDailyWage());
   }
}
class EmpUtil {
		//constants
		int empRatePerHr=20;
		int empHr;
		double salary;
      double empCheck = Math.floor((double)Math.random() * 10) % 3;

		//method to check employee is part time or full time and get daily wage
		public double getDailyWage() {

				if (empCheck == 0)
				{
					System.out.println("Employee is full time");
					empHr=8;
				}
				else if (empCheck == 1)
				{
					System.out.println("Employee is part time");
					empHr=4;
				}
				else
				{
					System.out.println("Employee is abscent");
					salary=0;
				}
				salary=empHr*empRatePerHr;
				return salary;
	}
}
