import java.util.*;

public class Prime{
    public static void main(String[] args) {


        //------------prime or not given end range----------------------------//
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int x=sc.nextInt();
        if(x<2 && x>0){
            System.out.println(x);
        }else if(x>0){

            System.out.println(1+"  prime");
            if(x>=2){
                System.out.println(2+"  prime");
            }
            for(int i=2;i<x;i++){
                for(int j=2;j<i;j++){
                    if(i%j==0){ 
                        System.out.println(i+"  Not prime");
                        break;
                    }else if(j==i-1){
                        System.out.println(i+"  prime");
                    }
                }
            }
        }
        
    }
 
 
}