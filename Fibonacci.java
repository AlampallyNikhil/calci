import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int i=0;
  int j=1;
  int temp;
  for (int k=0;k<=n;k++)
  {
         temp=i+j;
         System.out.println(temp);
         i=j;
         j=temp;
  }
    }
}