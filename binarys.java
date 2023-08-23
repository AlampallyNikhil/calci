import java.util.*;
public class binarys
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the size of the array");
	    int N = sc.nextInt();
	    int arr[] = new int[N];
        System.out.println("please enter array");
	    for(int i=0;i<N;i++){
	        arr[i] = sc.nextInt();
	    }
        System.out.println("enetre the key value");
	    int key = sc.nextInt();
	    int start,end,mid;
	    start = 0; end = N-1;
	    while(start<=end){
	         mid = (start+end)/2;
	        if(arr[mid] == key){
	            System.out.print(Math.sqrt(mid));
	            
	        }
	        else if(arr[mid]>key){
	            end = mid-1;
	        }
	        else{
	            start = mid+1;
	        }
	    }
	    System.out.print("Number not found");
	}
}