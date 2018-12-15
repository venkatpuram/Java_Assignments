import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TimeTest {

	private Time time;
	private Time time1;
	private Time time2;
	private Time time3;
	@Before
	public void setUp(){
		time = new Time(10,20);
		time1 = new Time(12,30);
		time2 = new Time(10,20);
		time3 = new Time(6,60);
	}
	@Test
	public void test() {
		String Result="addition of hours cannot be more than 24 hours ";
		Time answer = Time.sum(time, time1);
		answer.display();
		assertEquals(Result, "addition of hours cannot be more than 24 hours ");
	}
	@Test
	public void test1() {
		String Result="17 hrs 20 min";
		Time answer = Time.sum(time2, time3);
		answer.display();
		assertEquals(Result,answer.hours+" hrs "+answer.minutes+" min");
	}
}
