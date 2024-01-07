package collection;

import java.util.ArrayList;



public class Arraylist {
	public static void main(String[]args) {
		ArrayList <String> color= new ArrayList<String>();
		color.add("pink");
		color.add("yellow");
		color.add("purple");
		System.out.println(color.get(0));
		color.set(1, "orange");
		System.out.println(color);
		color.remove(0);
		System.out.println(color);
	}
	

}
