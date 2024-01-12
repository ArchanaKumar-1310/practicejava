package corejava;
import java.io.IOException;
import java.io.FileWriter;

public class Writefile {
	public static void main(String[]args) {
	try {
	FileWriter obj=new FileWriter("C:\\New file\\New folder\\sample.txt");
	obj.write("this my new project");
	obj.close();
	}catch(IOException e) {
		System.out.println("error");
		e.printStackTrace();
		
	}
	}

}
