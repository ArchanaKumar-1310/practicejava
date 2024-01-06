package abstraction;

public class Account implements Banking {
public void salary() {
	System.out.println("salary account");
}
public void current() {
	System.out.println("current account");
}
public void savings() {
	System.out.println("saving account");
}
public static void main(String[]args) {
	Account obj=new Account();
	obj.current();
	obj.salary();
	obj.savings();
}
	

}
