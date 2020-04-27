public class EmpWageBuilder {

		public static void main(String[] args) {
			//constants
			int IS_FULL_TIME = 1;
			int IS_PART_TIME = 2;
			int emp_rate_per_hr=20;
			int emp_hr;
			double salary;
					//computation
			double empCheck = Math.floor(Math.random() * 10) % 3;
			if (empCheck == IS_FULL_TIME){

				emp_hr=8;

				System.out.println("Employee is full time");
			}
			else if (empCheck == IS_PART_TIME){
				emp_hr=4;
				System.out.println("Employee is part time");
			}
			else{
				emp_hr=0;
				System.out.println("Employee is abscent");
			}
				salary=emp_hr*emp_rate_per_hr;
				System.out.println("Employee wage is::"+salary);
		}
}

