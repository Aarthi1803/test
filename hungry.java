import java.util.Scanner;

public class hungry{
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
		System.out.println("Are you hungry?");
		String message=scan.nextLine();
		if(message.equalsIgnoreCase("yes"))
		System.out.println("eat samosa");
		else
		System.out.println("do your homework");

}
}