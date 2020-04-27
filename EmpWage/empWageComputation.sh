#!/bin/bash -x

isFullTime=1;
isPartTime=2;
empRatePerHr=20;
empCheck=$((RANDOM%3))

case $empCheck in
		$isFullTime)
				empHr=8 ;;
		$isPartTime)
				empHr=4 ;;
		*)
				empHr=0 ;;
esac
salary=$(($empHr*$empRatePerHr))
