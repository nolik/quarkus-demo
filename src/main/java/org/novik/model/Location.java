package org.novik.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Location extends PanacheEntity {
    private String name;
    private String address;
    private String country;
    private String city;
    @Column(name = "company_id")
    private Long companyId;

    public Location() {
    }

    public Location(String name,
                    String address,
                    String country,
                    String city,
                    Long companyId) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.city = city;
        this.companyId = companyId;
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

    public Long getCompanyId() {
        return companyId;
    }
}
