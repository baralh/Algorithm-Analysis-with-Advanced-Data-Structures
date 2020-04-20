//package cmsc401.java;


//Heman Baral
//Trial Assignment

import java.util.Scanner;


public class cmsc401 {

    private static Scanner sc;
	private static int i;
	private static int lines;
	private static int[] value;
	private static int[] output;

	public static void main(String[]args)
    {
    		  
    		sc = new Scanner(System.in);

    		//declaring variables 
    		
    		i = 0;
    		int n;

    		//Creating 2 array to store input values
    		int [] value = new int[100];
    		int [] output = new int[100];
    		int index1,index2;
    		
    		// this reads number of lines
    		lines=sc.nextInt();
    		
    		
    		//loop to go thru lines
    		while(i<lines)
    		{
    		
    		//reads first number of each line
    		n=sc.nextInt();
    		
    		
    		
    		for(int j=1;j<=n-2;j++)
    		{
    		value[j]=sc.nextInt();
    		}
    		
    		// this reads the first index
    		index1=sc.nextInt();
    		
    		// this reads the second index 
    		index2=sc.nextInt();
    		
    		//multiplying number and storing in an array
    		output[i]=value[index1]*value[index2];
    		i++;
    		}
    		
    		// printing result
    		
    		for(int j=0;j<lines;j++)
    			
    		System.out.println(output[j]);
    		
    		}
    		  
    		}
