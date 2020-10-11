import java.util.Scanner;

public class hungry{
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
		System.out.println("Are you hungry?");
		String message=scan.nextLine();
		if(message.equalsIgnoreCase("yes"))
		System.out.println("eat samosa");
                System.out.println("eat pizza");
                System.out.println("eat burger");
		else
		
		System.out.println("are you thirsty?");
		 thirsty=scan.nextLine();
		if(thirsty.equalsIgnoreCase("yes"))
		System.out.println("drink water");

}
}