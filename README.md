gradle-dropwizard-sample
========================

This project showcases the possibilities of the [gradle-dropwizard](https://github.com/stackmagic/gradle-dropwizard) plugin.

Have a look at the `build.gradle` file to see how to use the gradle-dropwizard plugin. The accompanying dropwizard code is just a bit of scaffolding and not a real project. It's just good enough to verify everything works as expected.

Interesting gradle tasks are:

* dropwizardRun (ctrl-c to stop server)
* intTest to run integration tests against a running dropwizard instance
* TODO accTest to run acceptance tests against a running dropwizard instance
