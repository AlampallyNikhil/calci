import java.util.Arrays;

public class searchinn2Darray {
    public static void main(String[] args) {
        int[][] arr={
            {2,3,4,5,6},
            {1,230},
            {7,8,9}
        };
        int key=9;
        int[] ans=k(arr,key);
        System.out.println(Arrays.toString(ans));
    }
    static int[] k(int[][] arr)
    {
        for(int row=0;row<arr.length;row++)
       {
        for(int col=0;col<arr[row].length;col++)
        {
           if(arr[row][col]==key)
           {
            return new int[]{row,col};
           }
        }
       }
        return new int[]{-1,-1};
    }
}
