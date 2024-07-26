//union of two sets
//smallest subsequence in a string containing another string
//RECURSION
//Tecursian is a programming technique in which a function calls itself in order to solve a problem
//this involves function breaking them down into smaller more manageable sub-problems that resemble the original problem
//Types of recursion
//*Direct Recursion
//*InDirect Recursion
package Recursion;

public class recursive {
	public static int fact(int n) {
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String[] args) {
		int n=5;
		int sum=fact(n);
		System.out.print(sum);

	}

}
