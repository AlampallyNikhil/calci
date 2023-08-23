public class coloum {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6}};// we should first prist the values @ a[0]=1,2,3 so we need to declare the coloum length as 
        //a[0].length so it will be stick to the 1,2,3 and then increment takes place and the arr value gets changed
       //row
       System.out.println("[");
           for(int j=0;j<a[0].length;j++)
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.print(""+a[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("]");
    }
}
