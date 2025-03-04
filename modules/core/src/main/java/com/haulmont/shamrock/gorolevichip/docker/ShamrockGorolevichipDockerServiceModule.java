package com.haulmont.shamrock.gorolevichip.docker;

import com.haulmont.monaco.annotations.Module;
import com.haulmont.monaco.container.ModuleLoader;

@Module(
        name = "shamrock-gorolevichip-docker-service-module",
        depends = {
                "monaco-jetty",
                "monaco-core",
                "monaco-config",
                "monaco-graylog-reporter",
                "monaco-sentry-reporter"
        }
)
public class ShamrockGorolevichipDockerServiceModule extends ModuleLoader {

    public ShamrockGorolevichipDockerServiceModule () {
        super();
        packages(ShamrockGorolevichipDockerServiceModule.class.getPackageName());
    }
}
