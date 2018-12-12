package Basic_Assignments2;

public class ArrayOccurence {

	public int countOccurrence(String[] names, String searchname) {
		int count=0;
		for(int i=0;i<names.length;i++)
		{
			if(searchname.equals(names[i]))
			{
				count++;
			}
		}

		return count;

	}
}
