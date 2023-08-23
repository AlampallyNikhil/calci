import java.util.Scanner;

public class patt3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        pattern3(n);   
    }
    static void pattern3 (int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=n;col>=row;col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
