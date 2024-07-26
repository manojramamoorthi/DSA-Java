package Problem;
import java.lang.reflect.Array;
import java.util.*;
public class Problem_3_Salesbymatch {
    public static int counting(int[] arr){
        Arrays.sort(arr);
        int count=1;
        int sum=0;
        for(int i=1;i<arr.length;i++){
            if (arr[i]==arr[i-1]){
                count++;
            }
            else {
                count=count/2;
                sum+=count;
                count=1;
            }
        }
        return sum;
    }
    public static void main(String[] args){
//        Scanner sc=new Scanner();
        int n=7;
        int[] socks={1,2,2,1,1,3,5,1,2};
        System.out.print(counting(socks));
    }
}
