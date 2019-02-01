package bteskavi;
import java.util.Scanner;
public class Array2ddemo {

	public static void main(String[] args) {
		int[] arr=new int[4];
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the element of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Element are");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		s.close();
	}

}
