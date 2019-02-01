package bteskavi;
import java.util.Scanner;
public class Array9 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Enter two number");
		int x=t.nextInt();
		int y=t.nextInt();
		Array9 d=new Array9();
		System.out.println(d.sum(x,y));
		t.close();
	}
	int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}

}
