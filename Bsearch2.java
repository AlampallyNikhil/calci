public class Bsearch2 {
    public static void main(String[] args) {
        int arr[]= {2,4,5,7,8,9};
        int target=6;
       int ans= reiling(arr,target);
       System.out.println(ans);

    }
    //reiling is nothing greater number smallest than target i.e. before the target number
    static int reiling(int[] arr, int target)
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
            else if (target ==arr[mid])
            {
                return arr[mid];
            }
        }
        return arr[end];

    }
}
