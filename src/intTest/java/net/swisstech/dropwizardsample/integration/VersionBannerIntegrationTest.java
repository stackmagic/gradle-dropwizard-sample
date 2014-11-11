package net.swisstech.dropwizardsample.integration;

import java.io.IOException;

import net.swisstech.dropwizard.util.VersionFetcher;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/** dummy integration test that fetches the version banner from the running DW instance */
public class VersionBannerIntegrationTest {

	@Test
	@Parameters("DROPWIZARD_ADM_HTTP")
	public void getVersionBanner(String dwAdmHttp) throws IOException {
		VersionFetcher.getVersion(dwAdmHttp);
	}
}
