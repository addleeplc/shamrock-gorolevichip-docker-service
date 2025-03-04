/*
 * Copyright (c) 2025 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.
 */

package com.haulmont.shamrock.gorolevichip.docker;

import com.haulmont.monaco.rs.jersey.Application;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class ServiceApplication extends Application {
    public ServiceApplication() {
        super();
        packages(ServiceApplication.class.getPackage().getName());
    }
}
