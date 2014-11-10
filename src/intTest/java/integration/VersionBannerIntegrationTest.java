package integration;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/** dummy integration test that fetches the version banner from the running DW instance */
public class VersionBannerIntegrationTest {

	@Test
	@Parameters("DROPWIZARD_ADM_HTTP")
	public void getVersionBanner(String dwAdmHttp) throws IOException {
		URL url = new URL(dwAdmHttp + "/version");
		String version = IOUtils.toString(url);
		assertNotNull(version);
		assertTrue(version.length() > 0);
		System.out.println("!!! VERSION BANNER = " + version);
	}
}
