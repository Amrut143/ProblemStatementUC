#!/bin/bash -x

read -p "Enter first number:: " a
read -p "Enter second number:: " b
read -p "Enter third number:: " c

declare -A dict

dict["result1"]="$(( $a + $b * $c ))"
dict["result2"]="$(( $a * $b + $c ))"
dict["result3"]="$(( $c + $a / $b ))"
dict["result4"]="$(( $a % $b + $c ))"
function descending() {
val=("$@")
array=();
for values in "${val[@]}"
do
	array+=("${values[@]}")
done

echo "Array values before sorting:: ${array[@]}"


for (( i=0; i<${#array[@]}; i++ ))
do
   for (( j=$i; j<${#array[@]}; j++ ))
   do
      if [ ${array[$i]} -gt ${array[$j]} ]
      then
            temp=${array[$i]}
            array[$i]=${array[$j]}
            array[$j]=$temp
      fi
   done
done

echo "Array values after sorting:: ${array[@]}"


}
	echo $(descending "${dict[@]}")
