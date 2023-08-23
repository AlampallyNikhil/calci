public class Bsearch {
    public static void main(String[] args) {
        int arr[]= {2,4,5,6,7,8,9};
        int target=7;
       int ans= bs1(arr,target);
       System.out.println(ans);

    }
    static int bs1(int[] arr, int target)
    {
        int start=0;
        int end=arr.length -1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target < arr[mid])
            {
                end=mid-1;
            }
            else if (target > arr[mid])
            {
                start=mid+1;
            }
            else 
            {
                return arr[mid];
            }
        }
        return -1;

    }
}
