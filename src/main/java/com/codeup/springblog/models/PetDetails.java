package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "pet_details")
public class PetDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private boolean isSterile;
    private int weightInOunces;

    public boolean getIsSterile() {
        return isSterile;
    }
    public void setSterile(boolean sterile) {
        isSterile = sterile;
    }
}
