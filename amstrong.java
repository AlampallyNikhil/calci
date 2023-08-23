import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
     
       System.out.println("given number is amstrong number :  "+ amstrong1(n));
     amstrong1(n);
    }
    static boolean amstrong1(int n)
    {
         int digits=0,temp;
         int sum=0;
         temp=n;
         while(temp>0)
         {
            temp/=10;
            digits++;
         }
         System.out.println("no of digits are :"+" "+digits);
         int temp2=n;
         while(temp2>0)
         {
            int lastDigit=temp2%10;
            sum=(int) (sum+Math.pow(lastDigit, digits));
            temp2/=10;
         }
         if(sum==n)
           return true;



        return false;

      
        

    }
    // static int amstrong1(int n)
    // {
    //      int digits=0,temp;
    //      int sum=0;
    //      temp=n;
    //      while(temp>0)
    //      {
    //         temp/=10;
    //         digits++;
    //      }
    //      System.out.println("no of digits are :"+" "+digits);
    //      int temp2=n;
    //      while(temp2>0)
    //      {
    //         int lastDigit=temp2%10;
    //         sum=(int) (sum+Math.pow(lastDigit, digits));
    //         temp2/=10;
    //      }
       
    //     return sum;
     
          


        

      
        

    // }
}
