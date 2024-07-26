package Problem;

public class Problem_2_cipher {
	public static String merge(char[] str1,String str2){
		StringBuilder str=new StringBuilder();
		int maxi=Math.max(str1.length,str2.length());
		for (int i=0;i<=maxi;i++){
			if(i<str1.length){
				str.append(str1[i]);
			}
			if(i<str2.length()){
				str.append(str2.charAt(i));
			}

		}
		return str.toString();
	}
	public static void main(String[] args) {
		String ch="Hello";
		int n=4;
		char[] c = ch.toCharArray();
		for(int i=0;i<ch.length();i++) {
			c[i]+=n;
		}

		System.out.print(merge(c,"r8pha4203b"));
	}

}
