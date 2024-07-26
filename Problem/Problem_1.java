package Problem;

public class Problem_1 {
	public static int re(int n) {
		int x = n;
		int rev = 0;
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return rev;
	}

	public static int com(int n, int rev) {
		int co = n + rev;
		while (co != re(co)) {
			co = co + re(co);
		}
		return co;
	}

	public static void main(String[] args) {
		int n = 124;
		int ans = com(n, re(n));
		System.out.print(ans);
	}
}
