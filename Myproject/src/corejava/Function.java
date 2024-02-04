package corejava;

public class Function {
	
		public int addition(int a,int b) {
			return a+b;
		}
		public int subraction(int a,int b) {
			return a-b;
		}
		public int multiplicatin(int a,int b) {
			return a*b;
		}
		public static void main(String[] args) {
			Function obj=new Function ();
			int add=obj.addition(10, 20);
			System.out.println(add);
			int sub=obj.subraction(10, 7);
			System.out.println(sub);
			int mul=obj.multiplicatin(10, 30);
			System.out.println(mul);
		}
		

	}
	 


