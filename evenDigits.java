public class evenDigits {
    public static void main(String[] args) {
         int[] nums={21,222,2587,3,36852,25,-12};
         System.out.println(find(nums));
    }
    static int find(int[] nums)
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
            count++;
            }
        }
        return count;
    }
     static boolean even(int num) {
        int noofDigitts=digits(num);
        /*if(noofDigitts%2==0)
        {
            return true;
        }

        return false;
        */
        return noofDigitts%2==0;
    }
    static int digits(int num)

    {
        if(num<0)
         {
            
            num=num*-1;
         }
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}
