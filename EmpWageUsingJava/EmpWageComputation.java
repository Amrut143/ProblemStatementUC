class EmpWageComputation{
      /*
      *Main method
      *@param s
      */
      public static void main(String []s){
         int empType;
	 int dailyWage;
	 int workHrs;
	 // Totaldays variable counts days till 20 starting from day 1
	 int totalDays=1;
	 int loop_end=0;
	 int [] salaryAndHours = new int[2];
         System.out.println("Welcome to Employee Wage Computation Program");
	 Employee person = new Employee();
	 Random rand = new Random();
	 empType = rand.nextInt(2);
	 // fetching working hours per day based on type of employee
	 workHrs = person.getEmpType(empType);
	 //calculating daily wage of employee
	 dailyWage = person.getDailyWage(workHrs);
	 System.out.println("The daily wage is: "+dailyWage);
	 //calculating monthly wage of employee according to type of employee
         while (loop_end==0){
	    /*
	    *Storing salary and total working hours returned from getMonthlyWage method in salaryAndHours array
	    */
            salaryAndHours = person.getMonthlyWage(workHrs,totalDays,empType);
	    // Loop till 20 days are over or 100 working hours completed
            if(totalDays==20 || salaryAndHours[1]==100){
		if(totalDays==20){
		   System.out.println("20 days over!");
		   break;
		}
		else{
		   System.out.println("100 working hours completed!");
		   break;
		}
	    }
	 totalDays+=1;
         }
	 System.out.println("Total hours worked: "+salaryAndHours[1]);
         System.out.println("The monthly wage is: "+ salaryAndHours[0]);
      }
}
