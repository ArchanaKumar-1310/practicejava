package corejava;

public class Handelingexception {
	public static void main(String[]args) {
		try {
			String A="achu";
			System.out.println( A.charAt(2));
		}catch(Exception e) {
			System.out.println("the index is not found");
		}
	}

}
