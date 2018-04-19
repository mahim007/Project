package com.mbstu.restapicrud2.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;


@Provider
@Produces(MediaType.APPLICATION_JSON)


/**
 * Created by Habib on 21-08-2015.
 */
public class JacksonJsonProviderImpl
        extends com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider {

    private static com.fasterxml.jackson.databind.ObjectMapper commonMapper = null;

    public JacksonJsonProviderImpl() {
        if(commonMapper == null){
            ObjectMapper mapper = new ObjectMapper();

//            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//            mapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
            //mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            commonMapper = mapper;
        }
        super.setMapper(commonMapper);

    }

}
