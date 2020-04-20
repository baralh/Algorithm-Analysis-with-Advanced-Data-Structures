//Heman Baral
//Assignment 4
//Minimum Cost Rod Cutting using dynamic programming





import java.util.*;


class cmsc401 {


  public static int[][] matrixA;

  public static int[][] matrixB;

  public static int[] cutting_point;



  private static int method(int a, int b) {

    if (a + 1 >= b) {

      return 0;

    }

    int v = (int) matrixA[a][b];



    if (v != -1){

      return v;

    }


    int points = -1;

    int rSum = 0;

    v = Integer.MAX_VALUE; 

    for (int i = a + 1; i < b; i++) {

      rSum = method(a, i) + method(i, b) + cutting_point[b] - cutting_point[a];

      if (rSum < v) {

        v = rSum;

        points = i;
      }

    }

    matrixB[a][b] = points;

    return v;
  }



/*
static int cutRod(int cost[], int n) 
    { 
        if (n <= 0) 
            return 0; 
        int max_val = Integer.MIN_VALUE; 
  

        for (int i = 0; i<n; i++) 
            max_val = Math.max(max_val,cost[i] + cutRod(cost, n-i-1)); 
  
        return max_val; 
    } 


*/




  public static void main(String[] args) {

    int size;

    int [] rLength;

    int [] Total_Cost;

    ArrayList<Integer> arr = new ArrayList<Integer>();


    Scanner sc = new Scanner(System.in);

    size = sc.nextInt();

    rLength = new int[size];

    for (int i = 0; i < size; i++) {

      rLength[i] = i + 1;
    
    }

    int cutting = sc.nextInt();
    
    cutting_point = new int[cutting];

    for (int i = 0; i < cutting_point.length; i++) {
    
      cutting_point[i] = sc.nextInt();
    
    }

    
    arr = new ArrayList<>();
    
    arr.add(0);

    List<Integer> newList = new ArrayList<>();

    
    for (int x : cutting_point) {
    
      newList.add(x);
    
    }

    arr.addAll(newList);

    sc.close();



    arr.add(size);

    int n = arr.size();

    cutting_point = new int[n];

    for (int x = 0; x < cutting_point.length; x++) {

      cutting_point[x] = arr.get(x);

    }

    arr.clear();

    matrixA = new int[n][n];

    matrixB = new int[n][n];

    Total_Cost = new int[n];


    for (int a = 0; a < n; a++) {

      matrixA[a] = new int[n];

      matrixB[a] = new int[n];

      for (int b = 0; b < n; b++) {

        matrixA[a][b] = -1;
      }
    }

    int min_cost = method(0, n - 1);

    System.out.println(min_cost);


  }















 
}