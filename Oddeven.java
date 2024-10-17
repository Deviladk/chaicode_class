import java.util.*;

public class  Oddeven{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);



         //-----------------------Even or odd-------------------------//

         
    //     System.out.println("Enter the number");
    //     int x=sc.nextInt(); 
    //    if(x%2!=0){
    //      System.out.println("Odd");
    //    }else{
    //     System.out.println("even");
    //    }



        //----------------------Chracter is vowel or not--------------------------//
      
        // System.out.println("Enter the character");
        //  char ch=sc.next().charAt(0); 

        //  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //     System.out.println("Vowel");
        //  }else{
        //     System.out.println("not Vowel");
        //  }




           //-----------------------------Leap-year----------------------------//
             
        // System.out.println("Enter the Year");
        // int yr=sc.nextInt();
        // if((yr%4==0 && yr%100!=0) || yr%400==0){
        //     System.out.println("Leap year");
        // }else{
        //     System.out.println("Not Leap year");
        // }





            //------------------Even with range-----------------------------//
        System.out.println("Strat");
        int st=sc.nextInt();
        System.out.println("End");
        int num=sc.nextInt();
        for(int i=st;i<=num;i++){
            if(i%2==0){
                System.out.println(i+" is Even");
            }else{
                System.out.println(i+" is Odd");
            }
        }

    }



}