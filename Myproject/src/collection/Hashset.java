package collection;

import java.util.HashSet;

public class Hashset {
	public static void main(String[]args) {
		HashSet <String> color= new HashSet<String>();
		color.add("pink");
		color.add("yellow");
		color.add("purple");
		System.out.println(color);
		System.out.println(color.contains("blue"));
		System.out.println(color.contains("pink"));
	}

}
