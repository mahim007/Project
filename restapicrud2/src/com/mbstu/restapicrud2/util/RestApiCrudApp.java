package com.mbstu.restapicrud2.util;

import com.mbstu.restapicrud2.filter.ResponseCorsFilter;
import com.mbstu.restapicrud2.resource.CompanyResource;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.TracingConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * Created by habib on 8/22/15.
 */
public class RestApiCrudApp extends ResourceConfig{
    public RestApiCrudApp(){
        //Resources
        packages(CompanyResource.class.getPackage().getName());
        register(LoggingFilter.class);
        register(com.mbstu.restapicrud2.filter.ResponseCorsFilter.class);
        register(RolesAllowedDynamicFeature.class);

        // Tracing support.
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        property(ServerProperties.TRACING, TracingConfig.ALL.name());
    }
}
