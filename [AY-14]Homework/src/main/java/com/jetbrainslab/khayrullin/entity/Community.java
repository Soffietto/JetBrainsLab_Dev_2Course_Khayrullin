package com.jetbrainslab.khayrullin.entity;

import java.sql.Timestamp;

public class Community {
    private int id;
    private String name;
    private String description;
    private int founderID;
    private Timestamp createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFounderID() {
        return founderID;
    }

    public void setFounderID(int founderID) {
        this.founderID = founderID;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
