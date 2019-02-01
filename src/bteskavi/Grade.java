package bteskavi;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
	int marks,m;
	Scanner p=new Scanner(System.in);
	System.out.println("Enter marks");
	marks=p.nextInt();
	m=marks/10;
	switch(m)
	{
	case 10:
	case 9:
	case 8:
		System.out.println("Excellent");
		break;
	case 7:
		System.out.println("very Good");
		break;
	case 6:
	case 5:
		System.out.println("Good");
		break;
	case 4:
		System.out.println("Average");
		break;
		default:
			System.out.println("Fail");
			
	}
	}

}
