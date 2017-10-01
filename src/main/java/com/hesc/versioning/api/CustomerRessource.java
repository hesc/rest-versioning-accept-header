package com.hesc.versioning.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerRessource {

    CustomerRepo repo = new CustomerRepo();

    @GET
    @Produces("application/vnd.customerservice-v1+json")
    public CustomerV1 getCustomerV1() {
        return repo.getCustomerV1();
    }

    @GET
    @Produces("application/vnd.customerservice-v2+json")
    public CustomerV2 getCustomerV2() {
        return repo.getCustomerV2();

    }


}
