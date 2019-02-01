package bteskavi;
import java.util.Scanner;
public class Minnum {

	public static void main(String[] args) {
	int[] arr=new int[10];
	int i,min;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 10 number in array");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
      min=arr[0];
      for(i=1;i<arr.length;i++)
      {
    	  if(arr[i]<min)
    	  {
    		  min=arr[i];
    	  }
      }
      System.out.println(min);
	}

}
