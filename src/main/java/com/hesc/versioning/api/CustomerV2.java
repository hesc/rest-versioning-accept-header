package com.hesc.versioning.api;

public class CustomerV2 {

    private String id;
    private String firstname;
    private String name;

    public CustomerV2() {
    }

    public CustomerV2(String id, String firstname, String name) {
        this.id = id;
        this.firstname = firstname;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
