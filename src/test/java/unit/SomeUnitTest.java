package unit;

import static org.testng.Assert.assertEquals;
import net.swisstech.dropwizardsample.Main;

import org.testng.annotations.Test;

public class SomeUnitTest {

	@Test
	public void dummyTest() {
		assertEquals("dropwizard-sample", new Main().getName());
	}
}
