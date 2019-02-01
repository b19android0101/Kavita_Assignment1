package bteskavi;
import java .util.Scanner;
public class Prime2 {

	public static void main(String[] args) {
		boolean flag=true;
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=p.nextInt();
		for(int i=2;i<=n-1;i++)
		{
			if((n%i)==0)
			{
				flag=false;
			break;
		}
		}
	if(flag==false)
		System.out.println("not a Prime no.");
	else
	{
		System.out.println("Prime no.");
	}
	
}

		}


