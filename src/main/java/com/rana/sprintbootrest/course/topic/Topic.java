package com.rana.sprintbootrest.course.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id;

    private String descriptions;

    private int cost;

    public Topic(){

    }
    public Topic(final String id, final String descriptions, final int cost) {
        this.id = id;
        this.descriptions = descriptions;
        this.cost = cost;
    }

    public Topic(final String id, final String descriptions) {
        this.id = id;
        this.descriptions = descriptions;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(final String descriptions) {
        this.descriptions = descriptions;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(final int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
