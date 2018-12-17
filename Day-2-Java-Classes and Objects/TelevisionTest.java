import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {

	private Television television;
	@Before
	public void setUp()
	{
		television=new Television();
		television.setState(true);
		television.setChannel(16);
		television.setVolume(10);
	}
	@Test
	public void Statetest() {
		assertEquals(true,television.ModeTv());
	}
	@Test
	public void Volumetest() {
		assertEquals(10,television.currentVolume());
	}
	@Test
	public void IncrementVolumetest() {
		assertEquals(11,television.volumeIncrement());
	}
	@Test
	public void DecrementVolumetest() {
		assertEquals(9,television.volumeDecrement());
	}
	@Test
	public void Channeltest() {
		assertEquals(16,television.currentChannel());
	}
	@Test
	public void IncrementChanneltest() {
		assertEquals(17,television.channelIncrement());
	}
	@Test
	public void DecrementChanneltest() {
		assertEquals(15,television.channelDecrement());
	}
	@Test
	public void PowerOfftest() {
		assertEquals(false,television.changeState());
	}
	

}
