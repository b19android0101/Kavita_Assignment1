package bteskavi;

public class Prime3 {

	public static void main(String[] args) {
		
			int j;
		for(int i=1;i<=100;i++)
		{
			for( j=2;j<100;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
			{
				System.out.println(i);
			}
		}
		

	}

}
