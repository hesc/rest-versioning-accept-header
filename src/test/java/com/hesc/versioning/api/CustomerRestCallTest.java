package com.hesc.versioning.api;

import org.glassfish.jersey.client.*;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;


public class CustomerRestCallTest {

    @Test
    public void testVersion1() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/customer");
        Response resp =  target.request("application/vnd.customerservice-v1+json").get();
        CustomerV1 customer = resp.readEntity(CustomerV1.class);
        assertEquals("Max", customer.getFirstname());
    }

    @Test
    public void testVersion2() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/customer");
        Response resp =  target.request("application/vnd.customerservice-v2+json").get();
        CustomerV2 customer = resp.readEntity(CustomerV2.class);
        assertEquals("Max", customer.getFirstname());
    }
}
