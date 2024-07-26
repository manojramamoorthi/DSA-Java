package Problem;

public class loop {
    public static void main(String[] args){
        int a=6;
        int b=12;
        int i=a;
        int j=b;
        int x=0;
        int[] list=new int[b-a+1];
        while(i<=b && j>=a){
            if(i%2!=0){
                list[x]=i;
                x++;
            } if (j%2==0){
                list[x]=j;
                x++;
            }
            j--;
            i++;
        }
        for(i=0;i<list.length;i++) {
            System.out.print(list[i]+" ");
        }
    }
}
