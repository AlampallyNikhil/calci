import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n,c,s=0,r;
        System.out.println("enter number n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=n;//c=212
        while(n>0) //212>0
        {
              r=n%10; //r=212%10 =21%10=1
              s=(s*10)+r;//0*10+2 0*1025+1 s=212
              n=n/10;//n=21
        }
        if(c==s)
        {
              System.out.println(s+" is plaindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

       
        
    }
}
