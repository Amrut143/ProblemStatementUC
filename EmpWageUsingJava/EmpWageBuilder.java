public class EmpWageBuilder {

		public static void main(String[] args) {
			//constants
			double IS_FULL_TIME = 1;
			double IS_PART_TIME = 2;
			int emp_rate_per_hr=20;
			int emp_hr;
			double salary;
					//computation
			double random = Math.floor((double)Math.random() * 10) % 3;
			int empCheck=(int)Math.round(random);
			switch (empCheck){

				case 1:
				emp_hr=8;
				System.out.println("Employee is full time");
				break;

				case 2:
				emp_hr=4;
				System.out.println("Employee is part time");
				break;

				default:
				emp_hr=0;
				System.out.println("Employee is abscent");
				}
				salary=emp_hr*emp_rate_per_hr;
				System.out.println("Employee wage is::"+salary);
		}
}

