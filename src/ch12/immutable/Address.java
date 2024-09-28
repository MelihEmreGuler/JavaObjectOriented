package ch12.immutable;

import java.util.List;

public final class Address {
    private final String name;
    private final List<String> streets;
    private final String city;
    private final String state;
    private final String zip;

    public Address(String name, List<String> streets, String city, String state, String zip){
        this.name = name;
        this.streets = streets;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Address(Address address){
        this.name = address.name;
        this.streets = address.streets;
        this.city = address.city;
        this.state = address.state;
        this.zip = address.zip;
    }

    public String getName() {
        return name;
    }

    public List<String> getStreets() {
        return streets;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}
