import java.util.Scanner;
    // *****
    // *****
    // *****
    // *****
    // *****

public class patt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        System.out.println("enter the x value");
        int x=sc.nextInt();
        pattern1(n,x);  
    }
    static void pattern1(int n, int x)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=x;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
