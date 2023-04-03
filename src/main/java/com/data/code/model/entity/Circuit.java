package com.data.code.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Circuit {
    @Id
    @Column(name = "circuit_id", nullable = false)
    private Long circuitId;
    @Column(name = "circuit_ref")
    private String circuitRef;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "country")
    private String country;
    @Column(name = "lat")
    private String lat;
    @Column(name = "lng")
    private String lng;
    @Column(name = "alt")
    private String alt;
    @Column(name = "url")
    private String url;
}
