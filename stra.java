import java.util.Scanner;

public class stra {
   public static void main(String[] args) {
    //Scanner sc =new Scanner(System.in);
    int rows=10;
    
    for(int i=0;i<=rows;i++)//i=0 i<10 t
    {
        for(int j=0;j< rows-i-1;j++)//j=0; j<10
      {
        System.out.print(" ");
      }for(int j=0;j<=i;j++)//1 2 3 4 5 6 7 8 9
      {System.out.print("*");}
      System.out.println();
    }
    
   } 
}
