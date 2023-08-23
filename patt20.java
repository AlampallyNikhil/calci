public class patt20 {
    // ****
    // *  *
    // *  *
    // *  *
    // ****
    public static void main(String[] args) {
       

        pattern20(5);
        
    }
    static void pattern20(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==1||row==n||col==1||col==n)
                {
                System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         
    }
}
