public class EmpWageBuilder {

		public static void main(String[] args) {
			//constants
			int IS_FULL_TIME = 1;
			int emp_rate_per_hr=20;
			int emp_hr=8;
			double salary;
					//computation
			double empCheck = Math.floor(Math.random() * 10) % 2;
			if (empCheck == IS_FULL_TIME){
				//salary computation
				salary=emp_hr*emp_rate_per_hr;

				System.out.println("Employee Daily Wage is::"+salary);
			}
			else{
				salary=0;
				System.out.println("Employee Daily Wage is::"+salary);
			}
		}
}
