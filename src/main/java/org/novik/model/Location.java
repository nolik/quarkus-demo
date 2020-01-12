package org.novik.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Location extends PanacheEntity {
    private String name;
    private String address;
    private String country;
    private String city;
    private Long company_id;
}
