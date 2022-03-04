package common;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testTruncateFirst2AsCharacters() {
		App helper=new App();
		assertEquals("CD",helper.truncateFirst2AsCharacters("AACD"));
	}

}
