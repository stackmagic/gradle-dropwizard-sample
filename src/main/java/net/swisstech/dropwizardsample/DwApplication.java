package net.swisstech.dropwizardsample;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import net.swisstech.dropwizard.util.DummyHealthCheckBundle;
import net.swisstech.dropwizard.util.DummyResourceBundle;
import net.swisstech.dropwizard.util.NullConfig;
import net.swisstech.dropwizard.util.VersionBundle;

/** main dropwizard application class. this example only adds a few bare essentials such as the version banner and a dummy resource and health check. */
public class DwApplication extends Application<NullConfig> {

	public static void main(String[] args) throws Exception {
		new DwApplication().run(args);
	}

	@Override
	public String getName() {
		return "dopewizard-sample";
	}

	@Override
	public void initialize(Bootstrap<NullConfig> bootstrap) {
		// version banner. you could use this on your servers to check for the new version being up and running after a deployment. once it's running, take the
		// acceptance jar and run these against the freshly deployed instance to verify it's working properly
		bootstrap.addBundle(new VersionBundle());

		// dummies when an app has neither of these (yet!) remove these when adding the real thing!
		bootstrap.addBundle(new DummyResourceBundle());
		bootstrap.addBundle(new DummyHealthCheckBundle());
	}

	@Override
	public void run(NullConfig configuration, Environment environment) throws InterruptedException {
		// add your resources here
	}
}
