package org.novik.dto;

public class LocationSummary {
    private final String id;
    private final String name;
    private final String address;
    private final String country;
    private final String city;

    public LocationSummary(String id,
                           String name,
                           String address,
                           String country,
                           String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }
}
