package smartPoint;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);

		// double x = scan.nextDouble() , a = scan.nextDouble() , answer = (x + a)*(x +
		// a);
		// int n = scan.nextInt();
		// for(int i = 1; i < n; i++) {
		// answer = (answer + a) * (answer + a);
		// }
		// answer = answer + a;
		// System.out.println(answer);
		// float answer, x = scan.nextInt(), chislitel = (x - 2), znamenatel = (x - 1);
		// for(int i = 4; i <= 64; i = i * 2) {
		// chislitel = chislitel * (x - i);
		// znamenatel = znamenatel * (x - (i -1));
		//
		// }
		// answer = chislitel / znamenatel;
		// System.out.println(answer);

		// double x = scan.nextDouble(), answer = 0;
		// boolean plus = true;
		// for (int i = 1; i <= 13; i+=2) {
		// int fact = 1;//1*2*3....*i
		// for (int j=1; j <= i ; j++) {
		// fact = fact * j;
		// }
		// if(plus == true) {
		// answer += Math.pow(x,i)/fact;
		// plus = false;
		// System.out.println("true " + answer);
		// }else {
		// answer -= Math.pow(x,i)/fact;
		// plus = true;
		// System.out.println("false " + answer);
		// }
		// }
//		           n
		// int n = scan.nextInt();
		// int arr[] = new int[100];//0 0 0 0 0 0 0 ... n times
		// 0 1 2 3 .. n-1
		// for(int i = 0; i < n; i++) {
		// arr[i] = scan.nextInt();
		// }
		//
		// for(int i = 0; i < n; i++) {
		// System.out.println("arr["+i+"] = " + arr[i]);
		// }
		// int i = -1;
		// do {
		// i++;
		// arr[i] = scan.nextInt();
		// }while(arr[i] != -1);
		// System.out.println("i = " + i);
		//
		// for (int j = 0; j < i; j++) {
		// System.out.print(arr[j] + " ");
		// }

		/*
		 * int arr[] = new int[8]; int index = -1; do { index++; arr[index] =
		 * scan.nextInt(); }while(arr[index] != 0);
		 * 
		 * for(int i = index-1; i >= 0; i--) { System.out.println(Math.sqrt(arr[i])); }
		 * 
		 * 
		 * } }
		 */

//			    int n;
//			    n = scan.nextInt(); // 6
//			    int arr[] = new int[n];
//			    for(int i = 0; i < n; i++) {
//			    	arr[i] = scan.nextInt();
//			    }
//			    int min = arr[0];
//			    int indexMin = 0;
//			    int max = arr[0];
//			    int indexMax = 0;
//			    int sum = 0;
//			    
//			    for(int i = 1; i < arr.length; i++) {
//			    	if(min > arr[i]) {
//			    		min = arr[i];
//			    		indexMin = i;
//			    	}
//			    	if(max < arr[i]) {
//			    		max = arr[i];
//			    		indexMax = i;
//			    	}
//			    }
//			    
//			    if(indexMax < indexMin) {
//			    	int temp = indexMin;
//			    	indexMin = indexMax;
//			    	indexMax = temp;
//			    }
//			    
//			    for(int i = indexMin +1; i < indexMax; i++) {
//			    	sum = sum + arr[i];
//			    }
//			    System.out.println(sum);
//			    

//			    

//			    bigO(n^2)
//			    
//			    i = ^
//			    j = -
//			    
//			    ^ 
//			    5 3 4 6 2 0
//			      -
//			    ^
//			    3 5 4 6 2 0
//			        -
//			    ^
//			    3 5 4 6 2 0
//			          -
//			    ^
//			    3 5 4 6 2 0
//			            -
//			    ^
//			    2 5 4 6 3 0
//			              -
//			      ^
//			    0 5 4 6 3 2

//			    int array[] = {1,2,3,4,5,6,7,8,9};
//			    //i
//			    //i narrow-i
//			    //1 narrow-i
//			    //2 narrow-i
//			    int narrow = array.length - 1;
//			    
//			    for(int i = 0; i< array.length; i++) {
//			    	int temp = array[i];
//			    	array[i] = array[narrow - i];
//			    	array[narrow - i] = temp;
//			    	for(int j = 0; j < array.length; j ++) {
//				    	System.out.print(array[j] + " ");
//				    }
//			    	System.out.println();
//			    }

//	int ncol = 3, nrow = 2;
//	int [][] array = new int[nrow][ncol];
//	
//	for(int i = 0; i < nrow; i++) 
//	{  
//		for(int j = 0; j < ncol; j++) {
//			int bar = scan.nextInt();
//			array [i][j] = bar;
//		}
//	}
//
//	//int [][] array = {{1,2,3},{4,5,6}};
//	for(int []line: array) { //select rows
//		for(int i:line) { //select numbers of rows
//		System.out.print(i+ " ");
//		}
//		System.out.println();
//	}

		// Enter number of users:
		// 3
		// Enter user with his number:
		// Danil 555-555
		// John 444-444
		// Mary 666-666

//	
//    boolean answer = false;
//	String [][] dataBase = 
//				{{"Tom","555-555"},
//				{"Mary","555-8976"},
//				{"John","555-1037"},
//				{"Rachel","555-1400"},
//				{"Sherry","555-8873"}};
//	String name = scan.next();
//	int index = 0;
//	
//	
//	for(int i=0; i < 5; i++) { 
//		//if( name == dataBase[i][0]); noway
//		if( (name.toUpperCase()).equals(dataBase[i][0].toUpperCase())) { //comparing UPPER NAME
//			answer = true;
//			index = i;
//		}
//	}
//	
//	
//	if(answer) {
//		System.out.println(dataBase[index][1]);
//	}else {
//		System.out.print("User " + name + " NOT FOUND!");
//	}

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

//	int n, m;
//	n = scan.nextInt();        //set size of array
//	m = scan.nextInt();
//	int [][] array = new int [n][m];  //array initialization
//	
//	for(int i = 0; i < n; i++) {        //
//		for( int j = 0; j < n; j++) {
//			array[i][j] = scan.nextInt();
//		}
//	}
//	
//	int sum = 0, sum2 = 0;
//	for(int i = 0; i < n; i++) {
//		sum = sum + array[i][i];
//		sum2 = sum2 + array[i][n-1-i];
//	}
//	System.out.println(sum + " " + sum2);

//		int n;
//		n = scan.nextInt();
//		int[] massiv = new int[n];
//		boolean flag = false;
//		for (int i = 0; i < n; i++) {
//			massiv[i] = scan.nextInt();
//			if(massiv[i] % 2 == 1) {
//				flag = true;
//			}
//		}
//		 
//		int index = 0;
//		int min = massiv[0];
//		int max = 0;
//		int indexMin = 0;
//		for (int i : massiv) {
//			System.out.println(i);
//		}
//		
//		
//		
//		for (int i = 1; i < massiv.length; i++) {
//			if (min > massiv[i]) {
//				min = massiv[i];
//				indexMin = i;
//			}
//		}
		// 2 5 8 7 1 9 8
		// 9 8 8 7 5 2 1
//		if(flag == true) {
//		sorting(massiv, true);
//		
//		for(int i : massiv) {
//			if(i % 2 != 0) {
//				System.out.println(i + " ");
//			}
//		}
//		}else System.out.println("empty");

		// Дома решить 501, 502, 503, 505, 509
		// Попробовать решить 506, 507
//    int N;
//    int M; 
//	int nindex = 0, mindex = 0;
//	N = scan.nextInt();
//	M = scan.nextInt();
//	
//	int[][]array = new int[N][M];
//	
//	
//	
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < M; j++) {
//				array[i][j] = scan.nextInt();
//				if(array[i][j] == 0) {
//					nindex = i;
//					mindex = j;
//					break;
//				}			
//			  }
//		   } 
//	System.out.println("\n\n");
//	System.out.println("M = " + nindex + " " + "N = "+ mindex);
		// Дома сделать 505 с именами + номерами в третью и вывести на печать начинаюеся
		// с В

//		int n;
//		n = scan.nextInt();
//
//		int[][] a1 = new int[n][n];
//		int[][] a2 = new int[n][n];
//
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				a1[i][j] = scan.nextInt();
//			}
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				a2[i][j] = scan.nextInt();
//			}
//		}
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				a2[i][j] = a1[i][j] + a2[i][j];
//			}
//		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//			System.out.print(a2[i][j] + " ");
//			
//		}System.out.println();
//			}
//		int n = scan.nextInt();
//		int a[][] = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				a[i][j] = scan.nextInt();
//			}
//		}
//		
//		boolean flag = true;
//		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				if (a[i][j] != a[j][i]) {
//					flag = false;
//					break;
//				}
//			}
//		}
//		
//		System.out.println(flag);
//
//		if (flag == false) {
//			System.out.println("NO");
//		} else {
//			System.out.println("YES");
//		}
//		System.out.println(flag);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int ar[][] = new int[n][m];
//		int array[] = new int[n * m];
//		int k = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				ar[i][j] = scan.nextInt();
//				if (ar[i][j] > 0) {
//					array[k] = ar[i][j];
//					k++;
//				}
//			}
//		}
//		Sorting.sorting(array, true);
//		for (int q : array) {
//			if (q > 0) {
//				System.out.print(q + " ");
//			}
//		}
		// 316 - ...
		// 512
//		 511* 516*
		
//				
		int array[][] = new int[7][7]; 
		
		for(int i = 0; i < 7; i++) {
			array [0][i] = 1;
		}
		for(int i = 0; i < 7; i++) {
			array [i][6] = 1;
		}
		for(int i = 6; i >= 0; i--) {
			array [6][i] = 1;
		}
		for(int i = 6; i >= 0; i--) {
			array [0][i] = 1;
		}
		
		//System.out.println(array[i][j]);
		scan.close();
	}
}
