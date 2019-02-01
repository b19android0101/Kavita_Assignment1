package bteskavi;
import java.util.Scanner;
public class Secondhnum {

	public static void main(String[] args) {
	int[] a=new int[5];
	int max1,max2,i;
	Scanner t=new Scanner(System.in);
	System.out.println("Enter element of array");
	for(i=0;i<a.length;i++)
	{
	a[i]=t.nextInt();	
	}
	max1=a[0];
	for(i=1;i<a.length;i++)
	{
		if(a[i]>max1)
		{
			max1=a[i];
		}
	}
	max2=a[0];
	for(i=1;i<a.length;i++)
	{
		if(a[i]>max2 && a[i]<max1)
		{
			max2=a[i];
		}
	}
	System.out.println("Second highest element is " + max2);
	}

}
