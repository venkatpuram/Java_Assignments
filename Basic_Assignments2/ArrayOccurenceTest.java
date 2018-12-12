package Basic_Assignments2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayOccurenceTest {

	private ArrayOccurence arrayOccurence;
	@Before
	public void setUp()
	{
		arrayOccurence = new ArrayOccurence();
	}
	@Test
	public void NamePresent() 
	{
		String names[]={"Dave", "George","Ann", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
		assertEquals(2, arrayOccurence.countOccurrence(names,"George"));
	}
	@Test
	public void NameNotPresent()
	{
		String names[]={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
		assertEquals(0, arrayOccurence.countOccurrence(names,"batista"));
	}

}
