public class EmpWageBuilder {

		public static void main(String[] args) {
			//constants
			double IS_FULL_TIME = 1;
			double IS_PART_TIME = 2;
			int emp_rate_per_hr=20;
			int emp_hr;
			int MAX_HR_IN_MONTH=100;
			double totalSalary=0;
			int num_Working_days=20;

			int totalEmphr=0;
			int totalWorkingdays=0;
					//computation
		while (totalEmphr<MAX_HR_IN_MONTH && totalWorkingdays<num_Working_days)
			{
				totalWorkingdays=totalWorkingdays+1;
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
				totalEmphr=totalEmphr+emp_hr;
			}
				totalSalary=totalEmphr*emp_rate_per_hr;
				System.out.println("Employee working hour is::"+totalEmphr);
            System.out.println("Employee salary for month is::"+totalSalary);

		}
}

