import java.io.*;
public class BufferedReaderExample {
public static void main(String args[])throws Exception{
	InputStreamReader r=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(r);
	System.out.println("enter the name:");
	String name=br.readLine();
	System.out.println("Welcome"+name);

}
}
