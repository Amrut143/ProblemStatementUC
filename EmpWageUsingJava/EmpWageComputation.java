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
		System.out.println("Welcom to employee wage computation");

		emp.isPresent();
	}
}
class EmpUtil {
		//assign variable to check emp present or abscent
		double empCheck = Math.floor((double)Math.random() * 10)% 2;
		//isPresent or abscent
		public boolean isPresent() {
		if (empCheck == 1)
		{
				System.out.println("Employee is present");
		}
		else
		{

				System.out.println("Employee is abscent");
		}
				return empCheck==1;
	}
}


