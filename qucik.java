public class qucik {
       public static int partition(int arr[],int s,int e){
        int i=s-1;
        int pivot = arr[e];
        for(int j=s;j<e-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = pivot;
        return arr[e] = temp;
    }
    public static void quicksort(int arr[],int s, int e){
        if(s<e){
            int q = partition(arr,s,e);
            quicksort(arr,s,q-1);
            quicksort(arr,q+1,e);
        }
    }
	public static void main(String[] args) {
	    int arr[] = {1,4,2,5,3,6};
	    quicksort(arr,0,arr.length-1);
	}
}

