import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Nikhil";

        char key = 'm';
System.out.println(search2(name, key));
      System.out.print( Arrays.toString(name.toCharArray())); 
       
    }

    static boolean search2(String str, char key) //for each
    {
         if(str.length()==0)
         {
            return false;
         }
         for(char ch:str.toCharArray())
         {
            if(ch == key)
            {
                return true;
            }
         }
         return false;
    }

    // static boolean search(String str, char key) // by for loop
    // {
    //      if(str.length()==0)
    //      {
    //         return false;
    //      }
    //      for(int index=0;index<str.length();index++)
    //      {
    //         if(key==str.charAt(index))
    //         {
    //             return true;
    //         }
    //      }
    //      return false;
    // }

}
