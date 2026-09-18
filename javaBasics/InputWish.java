import java.util.Scanner;
class InputWish{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Hello Welcome to Java-Practice Session");
System.out.println("Enter your wish");
String wish=sc.nextLine();
System.out.println("Your wish: "+wish);
sc.close();
}
}