package com.hesc.versioning.api;

public class CustomerRepo {

    public CustomerV1 getCustomerV1() {
        return new CustomerV1("1", "Max", "Muster");
    }


    public CustomerV2 getCustomerV2() {
        return new CustomerV2("1", "Max", "Muster");
    }
}
