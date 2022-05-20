package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "coffees")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String roast;

    @Column(nullable = false)
    private String origin;

    @Column(nullable = false)
    private String brand;


    public Coffee() {
    }

    public Coffee(String roast, String origin, String brand) {
        this.roast = roast;
        this.origin = origin;
        this.brand = brand;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setRoast(String roast) {
        this.roast = roast;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getId() {
        return id;
    }
    public String getRoast() {
        return roast;
    }
    public String getBrand() {
        return brand;
    }

    public String getOrigin() {
        return origin;
    }

}
