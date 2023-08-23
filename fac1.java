import java.util.Scanner;

public class fac1 {
    static int factorial(int n)//      [n!=n*factorial(n-1)] main hint of program
    {
        if(n<=1)
            return 1;
        else//5*4*3*2*1
             return n*factorial(n-1);//here factorial calls the function 5*4 store in result and it updates n value 
      
    }
    public static void main(String[] args) {
      int num , result;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the non negative number");
      num=s.nextInt();//5
      //n=5
      System.out.println(factorial(num));

 
      // //  4! = 1 * 2 * 3 * 4 = 24 
      // int num = 6;
      // long factorial = multiplyNumbers(num);//6
      // System.out.println("Factorial of " + num + " = " + factorial);
    }

    // private static long multiplyNumbers(int num) {
    //     if(num>=1)//6>1
        
    //     return num*multiplyNumbers(num-1);//6*5
    //     else
    //     return 1;
    // }
}
