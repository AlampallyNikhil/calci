import java.util.ArrayList;
import java.util.Scanner;

public class multiAL {
    public static void main(String[] args) {
        Scanner s=new  Scanner(System.in);
        ArrayList<ArrayList<Integer>> m= new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            m.add(new ArrayList<>());
        }

        for(int row=0;row<3;row++)
        {
           for(int col=0;col<3;col++)
           {
            m.get(row).add(s.nextInt());
           }
         
        }
        System.out.println(m);
    }
   
}
