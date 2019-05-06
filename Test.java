package smartPoint;
import java.util.Scanner;

public class Test {   
	
	static void sorting(int array[], boolean ascending) {
		if (ascending) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						int temp = array[i]; // 6 8
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} else {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] < array[j]) {
						int temp = array[i]; // 6 8
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//	      вывод дней недели
	// . int day = 1;
	// char character = 'm';
	//
	// if (day == 1) {
	// System.out.println("monday");
	// }
	// else if (day == 2)
	// System.out.println("tuesday");
	// else if (day == 3)
	// System.out.println("wednesday");
	//
	//
	// switch(day) {
	// case 1: System.out.println("monday");
	// break;
	// case 2: System.out.println("tuesday");
	// break;
	//
	// default: System.out.println("not a day");
	// }
//
	// int x = 100;
//
	// while(x < 10) {
	// System.out.println(x);
	// x++;
	// }
//
	// 1 2 3
	// for(int i = 0; i < 10; ) {
	// System.out.println(i); //4
	// }
//
	// do {
	// System.out.println(x);
	// x++;
	// }while(x > 10);
//
	// double d = 0 ;
	// if(scan.hasNextDouble()) {
	// d = scan.nextDouble();
	// }
//
	// System.out.println(d);
	// int x, y;
	// float z, c;
	// x = scan.nextInt();
	//
	// y = scan.nextInt();
	//
	// z = scan.nextFloat();
	//
	// c = (x * x + y - z / 2);
	// System.out.println(c);
	//
	// int a, b;
	// a = scan.nextInt();
	// b = scan.nextInt();
	// if (a < b) {
	// System.out.println("<");
	// }
	// else if (a > b) {
	// System.out.println(">");
	//
	// }else
	// { System.out.println("=");
	// }
//
	// Проверка високосного года
//
	// int year = scan.nextInt();
	// if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
	// System.out.println("366");
	// }
	// else
	// { System.out.println("365");
	// }
//
	// boolean answer = false;
	// int day = scan.nextInt(), month = scan.nextInt(), year = scan.nextInt();
	// if (year >= 0) {
	// if (month <= 12 && month > 0) {
	// if (month % 2 == 1 && month < 8 || month % 2 == 0 && month >= 8) {
//		if (day > 0 && day < 32) {
//			answer = true;
//		}
	// } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//		if (day > 0 && day < 31) {
//			answer = true;
//		}
	// } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//		if (day > 0 && day < 30) {
//			answer = true;
//		} else if (day > 0 && day < 29) {
//			answer = true;
//		}
	// }
	// }
	// }
	//
	//
	//
	//
	// if(answer == true) {
	// System.out.println("yes");
	// }else System.out.println("no");
//
	// int day = scan.nextInt();
	// int month = scan.nextInt();
	// int year = scan.nextInt();
	//
	// boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0,
	// isThirtyOne = month % 2 == 1 && month < 8 || month % 2 == 0 && month >= 8,
	// isThirty = (month == 4 || month == 6 || month == 9 || month == 11);
	// if (year >= 0) {
	// if (month <= 12 && month > 0 && month !=2) {
	// if (isThirtyOne) {
//		if (month == 12 && day == 31) {
//			month = 1; day =1; year++;
//		} else if (month != 12 && day == 31) {
//			day = 1; month++;
//		}else day++;
	// }else if (isThirty && day == 30) {
//		day = 1; month++;	
	// }else day ++;
	// }else if(isLeap) {
	// if ( day != 29)
//		day++;
	// else {
//		day = 1; month++;
	// }
	// }else if (day == 28) {
	// day = 1; month++;
	// }else day++;
	// }
	// System.out.println(day + " " + month + " " + year);
//
	// int n = scan.nextInt();
	// long fact = 1;
	// for(int i = 1; i <= n; i++) {
	// fact = fact * i;
	// }
	// System.out.println(fact);
	// double answer = Math.sqrt(2);
	// int n = scan.nextInt();
	// for(int i = 1; i < n; i++) {
	// answer = answer + 2;
	// answer = Math.sqrt(answer);
	//
	// }
	// System.out.println(answer);
//
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
//
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
//	           n
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
//
	/*
	 * int arr[] = new int[8]; int index = -1; do { index++; arr[index] =
	 * scan.nextInt(); }while(arr[index] != 0);
	 * 
	 * for(int i = index-1; i >= 0; i--) { System.out.println(Math.sqrt(arr[i])); }
	 * 
	 * 
	 * } }
	 */
//		
//________________________________ Тема МАССИВЫ ______________________________________		
//		    int n;
//		    n = scan.nextInt(); // 6
//		    int arr[] = new int[n];
//		    for(int i = 0; i < n; i++) {
//		    	arr[i] = scan.nextInt();
//		    }
//		    int min = arr[0];
//		    int indexMin = 0;
//		    int max = arr[0];
//		    int indexMax = 0;
//		    int sum = 0;
//		    
//		    for(int i = 1; i < arr.length; i++) {
//		    	if(min > arr[i]) {
//		    		min = arr[i];
//		    		indexMin = i;
//		    	}
//		    	if(max < arr[i]) {
//		    		max = arr[i];
//		    		indexMax = i;
//		    	}
//		    }
//		    
//		    if(indexMax < indexMin) {
//		    	int temp = indexMin;
//		    	indexMin = indexMax;
//		    	indexMax = temp;
//		    }
//		    
//		    for(int i = indexMin +1; i < indexMax; i++) {
//		    	sum = sum + arr[i];
//		    }
//		    System.out.println(sum);
//		    
		    
//___________________________________   _____________________________________________		    
//		    
//		    int array[] = {6,3,5,2,59,7};
//		    
//		    for(int i = 0;i < array.length-1; i++) {
//		    	for(int j = i+1;j < array.length; j++) {
//		    		if(array[i] > array[j]) {
//		    			int temp = array[i]; // 6 8
//		    			array[i] = array[j];
//		    			array[j] = temp;
//		    		}
//		    		for(int k = 0;k < array.length; k++) {
//		    			if(k == i) {
//		    				System.out.print("->" + array[k] + " " );
//		    			}else if(k == j) {
//		    				System.out.print(array[k] + "<- " );
//		    			}
//		    			else System.out.print(array[k] + " " );
//				    }
//		    		System.out.println();
//		    	}
//		    }
//
//		    
//		    
//		   		    
//		    bigO(n^2)
//		    
//		    i = ^
//		    j = -
//		    
//		    ^ 
//		    5 3 4 6 2 0
//		      -
//		    ^
//		    3 5 4 6 2 0
//		        -
//		    ^
//		    3 5 4 6 2 0
//		          -
//		    ^
//		    3 5 4 6 2 0
//		            -
//		    ^
//		    2 5 4 6 3 0
//		              -
//		      ^
//		    0 5 4 6 3 2
//____________________________________   _____________________________________________		    
//
//            int array[] = {1,2,3,4,5,6,7,8,9};
//		    //i
//		    //i narrow-i
//		    //1 narrow-i
//		    //2 narrow-i
//            int narrow = array.length - 1;
//            for(int i = 0; i< array.length; i++) {
//		    	int temp = array[i];
//		    	array[i] = array[narrow - i];
//		    	array[narrow - i] = temp;
//		    	for(int j = 0; j < array.length; j ++) {
//			    	System.out.print(array[j] + " ");
//			    }
//		    	System.out.println();
//		    }
//		    
//		    
//		    
//		    1 2 3 4 5
//		    5 2 3 4 1
//		    5 4 3 2 1
//		    5 4 3 2 1
//____________________________________________________________________________________
//		int [] [] nums = {{1,2,3},{4,5,6}}; //инициализируем массив
//		for (int [] line : nums) { //перебор строк
//		for (int i : line) { //перебор элементов строки
//		System.out.print(i + " "); // вывод элементов строки
//		}
//		System.out.println(); // вывод пустой строки для визуализации массива
//		} 
//____________________________________________________________________________________
//      Sample input 2:
//      6
//      AAAABBBCDD
//        counter
//      Sample output 2:
//______________________________________    __________________________________________
//		char array[] = { 'A', 'A', 'A', 'B', 'B', 'B', 'D', 'E', 'E', 'E', 'E', 'E', 'F'};
//
//		for (int i = 0; i < array.length;) {
//			int counter = 1;
//			if (i < array.length - 1) {
//				while (array[i] == array[i + 1]) {
//					counter++;
//					i++;
//				}
//			}
//			System.out.println(array[i] + " " + counter);
//			i++;
//		}
//
//Дома решить 501, 502, 503, 505, 509
//Попробовать решить 506, 507
//--------------------------------------501-------------------------------------------
//			int N = 0, M = 0;
//			Scanner scan = new Scanner(System.in); // scan initialization
//			N = scan.nextInt(); // enter N value
//			
//			if (1 < N && N < 100) { // check N
//				M = scan.nextInt();// enter M value
//				if (1 <= M && M <= 100) {// check M
//					// array making
//					int[][] array = new int[N][M];
//					for (int i = 0; i < N; i++) {
//						for (int j = 0; j < M; j++) {
//							array[i][j] = scan.nextInt();// array fill
//						}
//					}
//					System.out.println("Двумерный массив целых чисел:");
//					for (int i = 0; i < N; i++) {
//						for (int j = 0; j < M; j++) {
//							System.out.format("%5d", array[i][j]);
//						}
//						System.out.println();
//					}
//					int min = array[0][0];
//					int max = array[0][0];
//	// select array for minimum
//					for (int i = 0; i < array.length; i++) {
//						for (int j = 0; j < array[0].length; j++) {
//							if (max < array[i][j]) {
//								max = array[i][j];
//							}
//							if (min > array[i][j]) {
//								min = array[i][j];
//							}
//						}
//					}
//					System.out.print("Максимальный элемент массива: " + max + " \n\n");
//					System.out.print("Минимальный элемент массива: " + min + " \n\n");
//	// End of select
//				} else
//					System.out.println("M Out of range");
//			} else
//			System.out.println("N Out of range");
//---------------------------------------504------------------------------------------
//			int N = 0, M = 0;
//			Scanner scan = new Scanner(System.in);
//			N = scan.nextInt();
//			M = scan.nextInt();
//			int[][] array = new int[N][M];
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < M; j++) {
//					array[i][j] = scan.nextInt();// array fill
//				}
//			}
//			
//			int Ni = 0, Mj = 0;
//			for(int i = 0; i < array.length; i++) {
//				for(int j = 0; j < array[i].length; j++) {
//					if(array[i][j] == -1) {
//						Ni = i + 1 ; Mj = j + 1;
//						//break;// safe first or safe last
//					}
//					
//					
//				}
//			}
//			
//			System.out.println(Ni +" "+ Mj);
//-----------------------------------------507----------------------------------------
//			
//			int N = 4;
//			int [][]a = {
//					{1,2,1,2},
//					{3,4,3,4},
//					{2,3,2,3},
//					{1,2,3,4}
//			};
//			int sum = 0;
//		//below
//			for(int i = 0; i < N - 1; i++) { // under i = 1; i < N
//				for(int j = i + 1; j < N; j++) {//under  j = 0; j < i
//					sum += a[i][j];
//				} 
//			}
//			System.out.println(sum);
//__________________________________________509_______________________________________	
//	             int n = 3, m = 4;
//	             int [][] a = {
//	            		 {1,2,3,4},
//	            		 {1,5,6,9},
//	            		 {1,1,8,8}
//	             };int []sum = new int[m];
//	             for(int j = 0; j < m; j++) {
//	            	 for(int i = 0; i < n; i++) {
//	            		 
//	            		 sum [j] += a[i][j];
//	            	 }
//	             }
//	             int indexMax = 0;
//	             int max = sum [0];
//	             for(int i = 0; i < m; i++) {
//	            	 if(sum[i] > max) {
//	            		 max = sum[i];
//	            		 indexMax = i;
//              	 }
//	             }System.out.println(max + " " + indexMax);
//		
//		
//______________________________________    _________________________________________            
scan.close();

	}
}
