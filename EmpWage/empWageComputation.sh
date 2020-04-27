#!/bin/bash -x

isFullTime=1;
isPartTime=2;
MAX_HR_IN_MONTH=4;
empRatePerHr=20;
numWorkingDays=20;

totalEmpHr=0;
totalWorkingDays=0;

function getWorkingHours() {
		case $1 in
					$isFullTime)
							workHours=8 ;;
					$isPartTime)
							workHours=4 ;;
					*)
							workHours=0 ;;
		esac
		echo $workHours
}


while (( $totalEmpHr<$MAX_HR_IN_MONTH && $totalWorkingDays<$numWorkingDays ))
do
   ((totalWorkingDays++))
	workHours="$( getWorkingHours $((RANDOM%3)) )"
	totalWorkHours=$(($totalWorkHours+$workHours))
done
totalSalary=$(($totalWorkHours*$empRatePerHr));
