import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        //priciple time and rate 
        Scanner sc =new Scanner(System.in);
        int principle=sc.nextInt();
        float time=sc.nextFloat();
        float rate=sc.nextFloat();
        {
            float SI=principle*time*rate/100;
            System.out.print("SI="+SI);
        }
    }
    
}
