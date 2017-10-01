package com.hesc.versioning.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerRessource {

    @GET
    @Produces("application/vnd.customerservice-v1+json")
    public CustomerV1 getCustomerV1() {
        return new CustomerV1("1", "Max", "Muster");
    }

    @GET
    @Produces("application/vnd.customerservice-v2+json")
    public CustomerV2 getCustomerV2() {
        return new CustomerV2("1", "Max", "Muster");
    }


}
