package corejava;
import java.util.Scanner;

public class userinput {
	public static void main(String[]args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("enter a name");
		String name= obj.nextLine();
		System.out.println("User name"+name);
		
		System.out.println("Enter age");
		int age=obj.nextInt();
		System.out.println("user age is "+age);
	}

}
