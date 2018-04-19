package com.mbstu.restapicrud2.filter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;


/**
 * Created by Habib on 6/6/14.
 */
public class ResponseCorsFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext req, ContainerResponseContext contResp) {
 
    	contResp.getHeaders().add("Access-Control-Allow-Origin","*");
    	contResp.getHeaders().add("Access-Control-Allow-Methods", "*, Cache-Control, Pragma, Origin, Authorization, X-Requested-With, POST,PUT, DELETE");
//    	if(null != contResp.getHeaderString("Access-Control-Request-Headers")&& !contResp.getHeaderString("Access-Control-Request-Headers").equals("")){
    	contResp.getHeaders().add("Access-Control-Allow-Headers", "*, Content-Type, GET, OPTIONS, X-XSRF-TOKEN");
//    	}
 
    }
 
}