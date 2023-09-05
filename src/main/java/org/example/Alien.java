package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "A_attributes")
public class Alien {
    @Id
    @Column(name = "A_ID")
    private int aid;
    @Column(name = "A_name")
    private String name;
    @Column(name = "C_id")
    private String color;
    public  Alien(){}
    public  Alien(int id,String name){
        this.aid= id;
        this.name=name;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + name + '\'' +
                '}';
    }
}
