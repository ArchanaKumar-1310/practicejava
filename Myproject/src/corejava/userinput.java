package corejava;
import java.util.Scanner;

public class userinput {
	public static void main(String[]args) {
		Scanner Obj =new Scanner(System.in);
		System.out.println("enter a name");
		String name= Obj.nextLine();
		System.out.println("User name"+name);
		
		System.out.println("Enter age");
		int age=Obj.nextInt();
		System.out.println("user age is "+age);
	}

}
