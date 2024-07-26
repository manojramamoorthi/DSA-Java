package Recursion;

public class Tail_recursion {

	public static int fact(int n,int accum) {
		if(n==0)
			return accum;
		return fact(n-1,n*accum);
	}
	public static void main(String[] args) {
		System.out.println(fact(5,1));
	}

}
