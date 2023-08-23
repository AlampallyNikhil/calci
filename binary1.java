import javax.lang.model.util.ElementScanner14;

public class binary1 {
    public static void main(String[] args) {
        int[] arr={1,-2,-33,-44,-55,-66};
        int target=-55;
        int ans=k(arr, target);
        System.out.println(ans);
        
    }
    static int k(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];//if the condition satisfy return true otherwise false
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(isAsc)
            {
                if(arr[mid]<target)
                {
                    start=mid+1;
                      //123456  mid=3   5    3<5
                }
                else if(arr[mid]>target)
                {
                    end=mid-1;
                }
              
            }
            else
            {
                if(arr[mid]<target)
                {
                    end=mid-1;//654321
                }
                else if(arr[mid]>target)
                {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
