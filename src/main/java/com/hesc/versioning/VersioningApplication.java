package com.hesc.versioning;

import com.hesc.versioning.api.CustomerRessource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class VersioningApplication extends Application<VersioningConfiguration> {

    public static void main(final String[] args) throws Exception {
        new VersioningApplication().run(args);
    }

    @Override
    public String getName() {
        return "versioning";
    }

    @Override
    public void initialize(final Bootstrap<VersioningConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final VersioningConfiguration configuration,
                    final Environment environment) {

        final CustomerRessource resource = new CustomerRessource();
        environment.jersey().register(resource);
    }

}
