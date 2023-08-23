import java.util.Scanner;

public class patt5 {
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        pattern5(n);
    }
    static void pattern5(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
         

        for(int row=n-1;row>=1;row--)
        {
            for(int col=1; col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
} 
