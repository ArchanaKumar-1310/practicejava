package collection;
import java.util.HashMap;

public class Hashmap {
	public static void main(String[]args) {
		HashMap<Integer,String> stddata= new HashMap<Integer,String>();
		stddata.put(101, "archana");
		//         key   value
		stddata.put(108, "gayu");
		stddata.put(103, "ramya");
		stddata.put(102, "gowri");
		System.out.println(stddata);
		stddata.remove(103);
		System.out.println(stddata);
		stddata.replace(108, "gayu", "mani");
		System.out.println(stddata);
		
		
		
		
	}

}
