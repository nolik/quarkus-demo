package org.novik.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
public class Location extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
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

    public Long getId() {
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

    public Long getCompanyId() {
        return companyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
