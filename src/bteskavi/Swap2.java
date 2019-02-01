package bteskavi;
import java.util.Scanner;
public class Swap2 {

	public static void main(String[] args) {
	int a,b;
	a=10;
	b=15;
	System.out.println("Before swapping");
	System.out.println("A="+a);
	System.out.println("B="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping");
	System.out.println("A="+a);
	System.out.println("B="+b);

	}

}
