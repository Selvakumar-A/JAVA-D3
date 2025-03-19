package session3;

public class array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
//		System.out.println(a[2]);
//		for(int i=0;i<a.length;i++) {
//			System.out.println("number in array"+a[i]);
//		}
		for(int i : a) {
			System.out.println(i);
		}
	}
}
