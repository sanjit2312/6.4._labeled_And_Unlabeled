package labeled_And_Unlabeled;

public class Unlabeled_Continue_Ststement
{

	public static void main(String[] args)
	{
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==3)
				{
					continue ;
				}
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
