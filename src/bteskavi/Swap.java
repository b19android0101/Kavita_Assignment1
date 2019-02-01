package bteskavi;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		
int a,b,c;
Scanner input=new Scanner(System.in);
System.out.println("enter the number");
a=input.nextInt();
b=input.nextInt();
System.out.println("Before swapping");
System.out.println("A="+a);
System.out.println("B="+b);
c=a;
a=b;
b=c;
System.out.println("After swapping");
System.out.println("A="+a);
System.out.println("B="+b);
	}
}
