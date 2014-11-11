package net.swisstech.dropwizardsample;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

/**
 * just a dummy test - for some reason, gradle requires at least 1 unit test and running of any task that includes the test task or else the
 * integration/acceptance tasks won't be executed
 */
public class DwApplicationTest {

	@Test
	public void dummyTest() {
		assertEquals("dopewizard-sample", new DwApplication().getName());
	}
}
