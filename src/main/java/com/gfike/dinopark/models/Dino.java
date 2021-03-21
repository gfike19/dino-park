package com.gfike.dinopark.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Dino {

    @Id @GeneratedValue
    @Column(name="ID")
    private int id;

    @Column(name="Dino_Name")
    private String dinoName;

    @Column(name="Dino_Type")
    private String dinoType;

    @Column(name="Comfort_Threshold")
    private int comfort;

    @Column(name="Grassland")
    private int grass;

    @Column(name="Forest")
    private int forest;

    @Column(name="Wetland")
    private int wetland;

    @Column(name="Max_Ideal_Pop")
    private int maxPop;

    @Column(name="Social_Group_Min")
    private int socialMin;

    @Column(name="Social_Group_Max")
    int socialMax;

    public Dino(){}

    public Dino(String dinoName, String dinoType, int comfort, int grass, int forest, int wetland, int maxPop,
                int socialMin, int socialMax) {
        this.dinoName = dinoName;
        this.dinoType = dinoType;
        this.comfort = comfort;
        this.grass = grass;
        this.forest = forest;
        this.wetland = wetland;
        this.maxPop = maxPop;
        this.socialMin = socialMin;
        this.socialMax = socialMax;
    }

    public int getId() {
        return id;
    }

    public String getDinoName() {
        return dinoName;
    }

    public void setDinoName(String dinoName) {
        this.dinoName = dinoName;
    }

    public String getDinoType() {
        return dinoType;
    }

    public void setDinoType(String dinoType) {
        this.dinoType = dinoType;
    }

    public int getComfort() {
        return comfort;
    }

    public void setComfort(int comfort) {
        this.comfort = comfort;
    }

    public int getGrass() {
        return grass;
    }

    public void setGrass(int grass) {
        this.grass = grass;
    }

    public int getForest() {
        return forest;
    }

    public void setForest(int forest) {
        this.forest = forest;
    }

    public int getWetland() {
        return wetland;
    }

    public void setWetland(int wetland) {
        this.wetland = wetland;
    }

    public int getMaxPop() {
        return maxPop;
    }

    public void setMaxPop(int maxPop) {
        this.maxPop = maxPop;
    }

    public int getSocialMin() {
        return socialMin;
    }

    public void setSocialMin(int socialMin) {
        this.socialMin = socialMin;
    }

    public int getSocialMax() {
        return socialMax;
    }

    public void setSocialMax(int socialMax) {
        this.socialMax = socialMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dino dino = (Dino) o;
        return getId() == dino.getId() && getComfort() == dino.getComfort() && getGrass() == dino.getGrass() && getForest() == dino.getForest() && getWetland() == dino.getWetland() && getMaxPop() == dino.getMaxPop() && getSocialMin() == dino.getSocialMin() && getSocialMax() == dino.getSocialMax() && getDinoName().equals(dino.getDinoName()) && Objects.equals(getDinoType(), dino.getDinoType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDinoName(), getDinoType(), getComfort(), getGrass(), getForest(), getWetland(), getMaxPop(), getSocialMin(), getSocialMax());
    }
}
