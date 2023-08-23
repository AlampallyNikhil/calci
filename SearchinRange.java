public class SearchinRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,60,8};
        int key=1+1;
        System.out.println(linearsearch(arr,key,2,5));
    }
    static int linearsearch(int[] arr,int key,int start,int end)
    {
        if(arr.length==0)
        {
              return -1; 
        }
        for(int index=start;index<=end;index++)
        {
            int elemnt=arr[index];
            if(elemnt==key)
            {
                return index;
            }
        }
        return -1;
        
    }
}
