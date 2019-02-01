package bteskavi;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the no.");
		int n=p.nextInt();
		int k=1;
		System.out.println("Enter the power");
		int pow=p.nextInt();
		for(int i=1;i<=pow;i++){
			k*=n;
		}
		System.out.println(" "+k);
		p.close();
		}

	}


