package net.swisstech.dropwizardsample;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import net.swisstech.dropwizard.util.DummyHealthCheckBundle;
import net.swisstech.dropwizard.util.DummyResourceBundle;
import net.swisstech.dropwizard.util.NullConfig;
import net.swisstech.dropwizard.util.VersionBundle;

public class Main extends Application<NullConfig> {

	public static void main(String[] args) throws Exception {
		new Main().run(args);
	}

	@Override
	public String getName() {
		return "dopewizard-sample";
	}

	@Override
	public void initialize(Bootstrap<NullConfig> bootstrap) {
		// DO NOT TOUCH: version banner required for int/acc tests
		bootstrap.addBundle(new VersionBundle());

		// dummies when an app has neither of these (yet!)
		// remove these when adding the real thing!
		bootstrap.addBundle(new DummyResourceBundle());
		bootstrap.addBundle(new DummyHealthCheckBundle());
	}

	@Override
	public void run(NullConfig configuration, Environment environment) throws InterruptedException {
		// add your resources here
	}
}
