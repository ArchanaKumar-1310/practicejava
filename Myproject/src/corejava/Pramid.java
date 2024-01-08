package corejava;

public class Pramid {
	public static void print(int n) {
		int i, j;
	for(i=0;i<n;i++)	
	{
		for(j=0;j<i;j++)
		{
			System.out.print(" "+ "*" + " ");
		}
	System.out.println();	
	}
	}
public static void main(String[]args)	{
	print(5);
}

}
