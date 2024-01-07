package collection;
import java.util.LinkedList;

public class Linklist {
public static void main(String[]args) {
	LinkedList<String> color= new LinkedList<String>();
	color.add("red");
	color.add("green");
	color.add("blue");
	System.out.println(color);
	color.addFirst("Yellow");
	System.out.println(color);
	color.addLast("black");
	System.out.println(color);
	color.removeFirst();
	color.removeLast();
	System.out.println(color);
	
}
}
