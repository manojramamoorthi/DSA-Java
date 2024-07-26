package Recursion;

public class Indirect_Recursion {
	public static void funa(int n) {
		if(n>0) {
			System.out.println("A:"+n);
			funb(n-1);
		}
	}
	public static void funb(int n) {
		if(n>0) {
			System.out.println("B:"+n);
			funa(n-1);
		}
	}

	public static void main(String[] args) {
		funa(5);
		

	}

}