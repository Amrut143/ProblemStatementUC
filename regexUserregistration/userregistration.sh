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
echo "Enter last name::"
read LastName
pat="^[[:upper:]][[:lower:]]{2,9}$"

if [[ $LastName =~ $pat ]]
then
	echo valid
else
	echo invalid
fi
echo "Enter email address::"
read Email
pat="^[0-9a-zA-Z]+"
pat="@[0-9a-zA-Z]+"
pat=".[a-zA-Z]{2,4}"
pat="([_+-.][a-zA-Z0-9]+)*"
pat="([.][A-Za-z]{3})$"
pat="^[0-9a-zA-Z]+([-_+.][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{3})*$"
if [[ $Email =~ $pat ]]
then
	echo valid email address
else
	echo invalid email address
fi
