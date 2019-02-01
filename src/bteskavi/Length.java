package bteskavi;
import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
	int x=1234,len=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your no.");
	x=s.nextInt();
	while(x>0)
	{
		len++;
		x=x/10;
	}
	System.out.println("length of the nois "+len);

	}

}
