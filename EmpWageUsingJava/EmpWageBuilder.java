public class EmpWageBuilder {

		public static void main(String[] args) {
			//constants
			double IS_FULL_TIME = 1;
			double IS_PART_TIME = 2;
			int emp_rate_per_hr=20;
			int emp_hr;
			double totalSalary=0;
			int num_Working_days=20;
			double salary=0;
					//computation
		for (int day=1; day<=num_Working_days; day++)
			{
			double random = Math.floor((double)Math.random() * 10) % 3;
			int empCheck=(int)Math.round(random);
			switch (empCheck){

				case 1:
				emp_hr=8;
				break;

				case 2:
				emp_hr=4;
				break;

				default:
				emp_hr=0;
				}
				salary=emp_hr*emp_rate_per_hr;
				totalSalary=totalSalary+salary;
			}
				System.out.println("Employee wage is::"+salary);
            System.out.println("Employee salary for month is::"+totalSalary);

		}
}

