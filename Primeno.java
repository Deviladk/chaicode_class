import java.util.*;

public class Primeno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int a,b,x,y;
        System.out.println("Enter start from");
        a=sc.nextInt();
        System.out.println("Enter mid1");
        b=sc.nextInt();
    
        System.out.println("Enter mid2");
        x=sc.nextInt();
        System.out.println("Enter End");
        y=sc.nextInt();
  ///a=5   b=75          x=158  y=500

        for(int i=a;i<b;i++){
            for(int j=2;j<i;j++){
                if(i%2==0){

                }else if(j==i-1){
                       System.out.println(i);
                }
            }
        }
    }
}
