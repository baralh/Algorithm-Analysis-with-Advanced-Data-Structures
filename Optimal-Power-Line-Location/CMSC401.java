/*

Heman Baral
CMSC 401
Assignment 2




********Using Counting Sort to get the optimal position of the main power line********
********with run time O(n)********

*/

import java.util.Scanner;

public class CMSC401{

public static final long RANGE_LIMIT = 1000000;

public static void Counting_Sort( int[] array )

{

int Array_length = array.length;

if (Array_length == 0)

return;

int range_max = array[0], range_min = array[0];

//Finding minimum and maximum range

for (int a = 1; a < Array_length; a++)

{

if (array[a] > range_max)

range_max = array[a];

if (array[a] < range_min)

range_min = array[a];

}

 //Finding Range with r_range 

int r_range = range_max - range_min + 1;




//Check for range greater than Max Range Limit


if (r_range > RANGE_LIMIT)

{

System.out.println("Error!!! Please provide appropriate number");

return;

}




int[] count = new int[r_range];

for (int a = 0; a < Array_length; a++)

count[array[a] - range_min]++;

for (int a = 1; a < r_range; a++)

count[a] += count[a - 1];

int b = 0;

for (int a = 0; a < r_range; a++)

while (b < count[a]) //instead of while (b < count[a]) i did while (b < count[b])

array[b++] = a + range_min;

}   








public static void main(String[] args)

{

Scanner sc = new Scanner( System.in );   

int a, b;

b = sc.nextInt();

int array[] = new int[ b ];

for (a = 0; a < b; a++)

array[a] = sc.nextInt();


//Calling counting Sort for running time of O(n)
Counting_Sort(array);



System.out.println((array[b/2]-1));   

System.out.println();

}   

}