import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ros[]=new int[3];
        for(int i=0;i<=ros.length;i++)
        {
            ros[i]=s.nextInt();
        }
        for(int i=0;i<ros.length;i++)
        {
           System.out.println(ros[i]);
        }
        
    }
}

