#!/bin/bash -x

isFullTime=1;
isPartTime=2;
MAX_HR_IN_MONTH=10;
empRatePerHr=20;
numWorkingDays=20;

totalEmpHr=0;
totalWorkingDays=0;

function getWorkHrs() {
		local $empCheck=$1
		case $1 in
					$isFullTime)
							empHr=8 ;;
					$isPartTime)
							empHr=4 ;;
					*)
							empHr=0 ;;
		esac
		echo $empHr
}
function getEmpWage() {
		local empHr=$1
		echo $(($empHr*$empRatePerHr))
}


while (( $totalEmpHr<$MAX_HR_IN_MONTH && $totalWorkingDays<$numWorkingDays ))
do
   ((totalWorkingDays++))
	empCheck=$((RANDOM%3))
	empHr="$( getWorkHrs $empCheck )"
	totalempHrs=$(($totalempHrs+$empHr))
	dailyWage[$totalWorkingDays]="$( getEmpWage $empHr )"
done
totalSalary=$(($totalempHrs*$empRatePerHr));
echo ${dailyWage[@]}
