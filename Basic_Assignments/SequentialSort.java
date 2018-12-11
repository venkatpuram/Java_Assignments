class SequentialSort
{
	public static void main(String[] args) throws Exception
	{
		int array[] = {10,45,2,78,4,56,12,98,9,25,36,85,42,69,39};
		int temporaryvalue;
		for(int point=0;point<15;point++)
		{
			for(int pointer1=point+1;pointer1<15;pointer1++)
			{
				if(array[point]>array[pointer1])
				{
				temporaryvalue=array[point];
				array[point]=array[pointer1];
				array[pointer1]=temporaryvalue;
				}
			}
		}
		for(int point=0;point<15;point++)
		{
		System.out.print(array[point]+" ");
		}
	}
}