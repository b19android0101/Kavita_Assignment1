package bteskavi;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
	
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the odd number");
			for(int i=1;i<=100;i+=2)
			{
				System.out.println(i);
			}
			System.out.println("enter the even number");
			for(int j=2;j<=100;j+=2)
			{
				System.out.println(j);
			}
		}
	}
}


