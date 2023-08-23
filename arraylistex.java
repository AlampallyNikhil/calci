import java.util.ArrayList;
import java.util.Scanner;

public class arraylistex {
    public static void main(String[] args) {        //as the elements increased from defined size than array list
        //create new memory which is double the difned size and the old elements added to new list and old list is deleted
        ArrayList<Integer> list=new ArrayList<>(10);

        // list.add(69);
        // list.add(5);
        // list.add(5);
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            list.add(s.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
