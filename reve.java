import java.util.Scanner;

public class reve {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int arr[]=new int[5];

        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();//{1,2,3,4,5,6}
        }
        for(int j=5-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
}
