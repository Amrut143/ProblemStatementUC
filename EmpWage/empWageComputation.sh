#!/bin/bash -x

isFullTime=1;
isPartTime=2;
MAX_HR_IN_MONTH=10
empRatePerHr=20;
numWorkingDays=20;

totalEmpHr=0;
totalWorkingDays=0;

while (( $totalEmpHr<$MAX_HR_IN_MONTH && $totalWorkingDays<$numWorkingDays ))
do
	((totalWorkingDays++))
	empCheck=$((RANDOM%3))
		case $empCheck in
					$isFullTime)
							empHr=8 ;;
					$isPartTime)
							empHr=4 ;;
					*)
							empHr=0 ;;
		esac
		totalEmpHr=$(($totalEmpHr+$empHr))
done
totalSalary=$(($totalEmpHr*$empRatePerHr));
