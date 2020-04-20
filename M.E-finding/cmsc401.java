//Heman Baral
//CMSC 401 assignment 1



//package cmsc401.java;

import java.util.*;

public class cmsc401

{
    
    
   

    //Checking Majority Element

    public static boolean MEcheck(int me[], int n, int candidate)

    {
        int i;

        //This store repeated number
        int repeated = 0;

        //Going thru loop to find repeated elements

        for (i = 0; i < n; i++)

        {
            //make candidate to current element

            if (me[i] == candidate)

                repeated++;

        }
       
        //check if repeated element is greater than n/2

        if (repeated > n / 2)

            return true;
        else

            return false;

    }
    public static int MEcandidate(int array[], int n)

    {

        int count = 1;
        int index = 0;

      

        // loop through the array

        for (int i = 1; i < n; i++)

        {

            // Increment the count if current number is the same as the chosen number

            if (array[index] == array[i])
                count++;

            else
                // if not decrease the count
                count--;

            if (count == 0)

            {

            	//set index to i and count to 1
                index = i;
                count = 1;
            }

        }

        return array[index];

    }

   

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        int n;
        int i;

        n = sc.nextInt();
       
        int[] array = new int[n];

       
        for( i = 0 ; i < n ; i++ )

            array[i] = sc.nextInt();

        //get majority element

        int number = MEcandidate(array, n);

        // check if the number is majority element

        if (MEcheck(array, n, number))

            System.out.println(number);

        else	

            System.out.println("-1");

    }

}

/*
 public static void main(String[]args)
 {
 
 Scanner sc = new Scanner(System.in);
 
 
 
 int n;
 
 System.out.print("Enter the number of elements in array : ");
 
 // get user input
 
 n = sc.nextInt();
 
 // create an array of size n
 
 
 
 
 int[] array = new int[n];
 
 for(int i = 0; i<n; i++) {
 array[i] = sc.nextInt();
 }
 
 int count = 0;
 
 for(int i=0;i<array.length;i++)
 {
 int j=0;
 
 while(j<array.length-1)
 {
 if(i==j)
 j=j+1;
 if(array[i]==array[j])
 count++;
 j++;
 }
 
 if(count>array.length/2)
 {
 System.out.println("majority element "+array[i]);
 break;
 }
 
 if (count > array.length/2) {
 
 
 System.out.println(array[i]);
 
 }
 
 
 
 
 
 }
 
 
 
 
 
 }
 
 
 
 */
