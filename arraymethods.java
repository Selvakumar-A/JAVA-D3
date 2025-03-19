package session3;

import java.util.Arrays;

public class arraymethods {
public static void main(String[] args) {
	int n[]= {2,3,4,5,6};
	System.out.println("length of array: "+n.length);
	
	int source[]= {1,2,3,4,5};
	int destination[]=new int[5];
	
	System.arraycopy(source, 0, destination, 0, source.length);
	
	for(int i : destination) {
		System.out.print(i+" ");
	}
	
	int ar[]= {9,8,7,6,5};
	Arrays.sort(ar);
	
	System.out.println(Arrays.toString(ar));
	Arrays.fill(ar, 5);
	System.out.println(Arrays.toString(ar));
	
	Arrays.fill(ar, 1,3,4);
	System.out.println(Arrays.toString(ar));
	
	
	
	
}
}
