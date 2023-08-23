import java.util.Arrays;
import java.util.Scanner;

public class strb {
    public static void main(String[] args) {
        String dtr[] = new String[4];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<dtr.length;i++)
        {
           dtr[i]=s.next();
        }
        System.out.println(Arrays.toString(dtr));
    }
}
