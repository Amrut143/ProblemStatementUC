#!/bin/bash

echo "Enter first name::"
read FirstName
pat="^[[:upper:]][[:lower:]]{2,10}$"

if [[ $FirstName =~ $pat ]]
then
	echo valid
else
	echo invalid
fi
