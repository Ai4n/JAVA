package smartPoint;
public class zarray_sort1 {
//Sorting array visualization
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int array[] = {6,3,5,2,59,7};
	    
	    for(int i = 0;i < array.length-1; i++) {
	    	for(int j = i+1;j < array.length; j++) {
	    		if(array[i] > array[j]) {
	    			int temp = array[i]; // 6 8
	    			array[i] = array[j];
	    			array[j] = temp;
	    		}
	    		for(int k = 0;k < array.length; k++) {
	    			if(k == i) {
	    				System.out.print("->" + array[k] + " " );
	    			}else if(k == j) {
	    				System.out.print(array[k] + "<- " );
	    			}
	    			else System.out.print(array[k] + " " );
			    }
	    		System.out.println();
	    	}
	    }
	}

}
