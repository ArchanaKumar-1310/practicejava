package abstraction;

public class Hdfc extends Bank {
	public void salary() {
		System.out.println("salary account");
	}
	public void current() {
		System.out.println("salary account");
	}
public static void main(String[]args) {
	Hdfc obj = new Hdfc();
	obj.current();
	obj.salary();
}	

}
