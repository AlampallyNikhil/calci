import java.util.Scanner;

public class stringforeach{
    public static void main(String[] args) {
        String[] s=new String[4];
        Scanner k=new Scanner(System.in);
        for(int i=0;i<s.length;i++)
        {
            s[i]=k.next();
        }
        for(String n:s)
        {
            System.out.println(n);
        }

    }
    
}
