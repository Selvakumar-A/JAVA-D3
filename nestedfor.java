package session3;

import java.util.Scanner;

public class nestedfor {
public static void main(String[] args) {
	//triangle pattern 
//	int i,j;
//	for(i=0;i<=5;i++) {
//		
//		for(j=1;j<=i+1;j++) {
//			System.out.print(" * ");
//			
//		}
//		System.out.println();
//	}
	
//	reverse-triangle pattern 
//	int i,j,n=6;
//	for(i=0;i<=n;i++) {
//		
//		for(j=1;j<=n-i;j++) {
//			System.out.print(" * ");
//			
//		}
//		System.out.println();
//	}
//	
//	//diamond  pattern 
	Scanner s = new Scanner(System.in);
	System.out.println("enter the no of rows");
	int a = s.nextInt();
	
	//first half
	for(int i=1;i<=a;i++) {
		for(int j=i;j<a;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//second half
	for(int i=a-1;i>=1;i--) {
		for(int j=a;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
