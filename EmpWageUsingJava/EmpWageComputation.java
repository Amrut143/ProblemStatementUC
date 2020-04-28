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
		System.out.println("Employee daily wage is"+emp.getDailyWage());
   }
}
class EmpUtil {
		//constants
		int empRatePerHr=20;
		int empHr;
		double salary;
      double attendance = Math.floor((double)Math.random() * 10) % 3;

		//method to return employee daily wage using switch case
		public double getDailyWage() {
			//convert empCheck from double to int
				int empCheck=(int)Math.round(attendance);
				switch (empCheck)
				{
					case 0:
						System.out.println("Employee is full time");
						empHr=8;
					break;

					case 1:
						System.out.println("Employee is part time");
						empHr=4;
					break;

					case 2:
						System.out.println("Employee is abscent");
						empHr=0;
					break;
				}
				salary=empHr*empRatePerHr;
				return salary;
	}
}
