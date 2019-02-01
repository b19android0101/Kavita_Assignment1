package bteskavi;
import java.util.Scanner;
public class Maxnum {

	public static void main(String[] args) {
	int[] arr=new int[10];
	int i,max;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 10 number in array");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	max=arr[0];
for(i=1;i<arr.length;i++)
{
	if(arr[i]>max)
	{
		max=arr[i];
	}
	
}
System.out.println(max);
	}

}
