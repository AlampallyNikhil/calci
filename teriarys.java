import java.util.Scanner;

public class teriarys {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the size of the array");
	    int N = sc.nextInt();
	    int arr[] = new int[N];
        System.out.println("please enter array");
	    for(int i=0;i<N;i++){
	        arr[i] = sc.nextInt();

        System.out.println("enetre the key value");
	    int key = sc.nextInt();
	    int s,e,m1,m2;
	    s = 0; e = N-1;
	    while(s<=e){
            m1=s+(e-s)/3;m2=s+((e-s)*2)/3;
	        if(arr[m1] == key){
	            System.out.print(m1);
	            return;
	        }
            else if(arr[m2]==key){
                System.out.print(m2);
            }
	        else if(arr[m1]>key){
	            e = m1-1;
	        }
            else if(arr[m2]<key){
                s=m2+1;
            }
	        else if(arr[m1]<key||arr[m2]>key){
	            s=m1+1;
                e=m2-1;
	        }
	    }
	    System.out.print("Number not found");
	}
}
}