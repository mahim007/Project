package com.mbstu.restapicrud2.resource;

import com.mbstu.restapicrud2.dao.CompanyDao;
import com.mbstu.restapicrud2.model.Company;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Habib on 22-08-2015.
 */

@Path("/v1/company")
@Api(value="/Company", description = "Operations about Company")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
@Component
public class CompanyResource {

    @Inject
    private CompanyDao companyDao;

    @GET
    @Path("/company")
    @ApiOperation(value = "Get company list", notes = "Get company list", position = 1,response= Company.class,responseContainer="List")
    public Response readCompanyList(@ApiParam(value = "Company Id", required = false) @QueryParam("companyId") Long companyId) {
        try {
            System.out.println("companyId:"+companyId);
            List<Company> companyList = companyDao.getCompanyList(companyId);
            return Response.ok().entity(companyList).build();
        } catch (Exception ex) {
            System.out.println("Exception in reading company:: " + ex.getMessage());
            return null;
        }
    }

    @POST
    @Path("/company")
    @ApiOperation(value = "Create Company",notes = "Create Company",position = 2)
    public Response createCompany(@ApiParam(value = "Create Company", required = true) Company company) {
        try {
            System.out.println("------>"+company);
            companyDao.saveOrUpdateCompany(company);
            System.out.println("{\"msg\":\"Company Saved Successfully\"}");
            return Response.status(Response.Status.CREATED).build();
        } catch (Exception ex) {
            System.out.println("Exception in save company:: " + ex.getMessage());
            System.out.println("{\"msg\":\"Company Save Failed\"}");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Path("/company")
    @ApiOperation(value = "Update Company",notes = "Update Company",position = 3)
    public Response updateCompany(@ApiParam(value = "Update Company", required = true) Company company) {
        try {
            System.out.println("------>"+company);
            companyDao.saveOrUpdateCompany(company);
            System.out.println("{\"msg\":\"Company Updated Successfully\"}");
            return Response.status(Response.Status.OK).build();
        } catch (Exception ex) {
            System.out.println("Exception in save company:: " + ex.getMessage());
            System.out.println("{\"msg\":\"Company Updated Failed\"}");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("/company")
    @ApiOperation(value = "Remove Company", notes = "Remove Company by id", position = 4)
    public Response deleteEvent(@QueryParam("companyId") Long companyId) {
        try {
            companyDao.deleteCompany(companyId);
            return Response.status(Response.Status.OK).build();
        } catch (Exception e) {
            System.out.println("Delete company failed:: " + e.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}