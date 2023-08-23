import java.util.*;
public class amstrong2
{
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int x = armstrong(n);
	    if(x==1){
	        System.out.print("Number is armstrong");
	    }
	    else{
	        System.out.print("Number is not armstrong");
	    }
	}
     static int armstrong(int n){
        int temp = n;
        int digits=0;
        while(temp>0){
            digits++;
            temp/=10;
        }
        temp = n;
        int sum=0;
        while(temp>0){
            sum+= Math.pow(temp%10,digits);
            temp/=10;
        }
        if(n == sum){
            return 1;
        }
        return 0;
    }
	
}
