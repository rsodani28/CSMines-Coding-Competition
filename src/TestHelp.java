import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestHelp {

	  public static void main(String[] args) {
	        List<StringBuilder> list = new ArrayList<>();
	        StringBuilder d1 = new StringBuilder("Working");
	        StringBuilder d2 = new StringBuilder("Eating");
	        StringBuilder d3 = new StringBuilder("Sleeping");
	        list.add(d1);
	        list.add(d2);
	        list.add(d3);
	        filter(list,(StringBuilder x )-> x.indexOf("e")!=-1);
	        System.out.println(list);
	    }
	 
	    private static void filter(List<StringBuilder> list, Predicate<StringBuilder> p) {
	        list.removeIf(p);
	    }
 

}
