package corejava;

public class Bufferclass {
	public static void main(String[]args) {
		StringBuffer obj=new StringBuffer("Archana");
		obj.append("Kumar");
		
		System.out.println(obj);
		obj.insert(0, "K");
		System.out.println(obj);
		obj.replace(3, 8, "hana");
		System.out.println(obj);
		obj.delete(3, 8);
		System.out.println(obj);
		obj.reverse();
		System.out.println(obj);
	}

}


