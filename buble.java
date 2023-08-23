import java.util.Scanner;

public class buble  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(); 
        int arr[]=new int[n];

        for(int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();//{1,2,3,4,5,6}
        } 
        for(int i=0;i<n-1;i++)//i=0 i<4
        {
            for(int j=0;j<n-i-1;j++) //j=0 j<5-0-1=4 2 4
            {
                if(arr[j+1]<arr[j]){//0<2   2<4f 3<4

                    int temp = arr[j+1];//temp=0 

                    arr[j+1] = arr[j];//j+1=2

                    arr[j] = temp;//j=0

                }//02435 02345
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}