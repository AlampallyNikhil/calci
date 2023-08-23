import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class reverse
{
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(10);
	    numbers.add(5);
	    numbers.add(15);
	    numbers.add(20);
	   
	   int k= Collections.max(numbers);
       numbers.remove(numbers.indexOf(k));
       int s=Collections.max(numbers);
       System.out.println("second largest is"+"="+s);
}
}
