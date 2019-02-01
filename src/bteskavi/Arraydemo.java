package bteskavi;
import java.util.Scanner;
public class Arraydemo {

	public static void main(String[] args) {
		int[] arr=new int[10];
	int i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 10 number in array");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
		
	}
System.out.println("Array is");
for(i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

}
