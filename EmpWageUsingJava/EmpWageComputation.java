/**
* Employee wage computation program
* @author: Amrut
*/
import java.util.Random;

public class EmpWageComputation {
		//main method
      public static void main(String[] args) {

         //create EmpUtil object
      final EmpUtil emp=new EmpUtil();
		System.out.println("Employee daily wage is"+emp.getDailyWage());
   }
}
class EmpUtil {
		//constants
		int empRatePerHr=20;
		int empHr=8;
		double salary;
      double empCheck = Math.floor((double)Math.random() * 10) % 2;

		//method for emp daily wage computation
		public double getDailyWage() {
				if (empCheck == 1)
				{
					salary=empHr*empRatePerHr;
				}
				else
				{
					salary=0;
				}
				return salary;
	}
}
