package com.gfike.dinopark.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DinoTypes {

    @Value("${dinoType.armoredHerbivore}")
    private String armoredHerbivore;

    @Value("${dinoType.hybridCarnivore}")
    private String hybridCarnivore;

    @Value("${dinoType.largeCarnivore}")
    private String largeCarnivore;

    @Value("${dinoType.largeHerbivore}")
    private String largeHerbivore;

    @Value("${dinoType.mediumSizedCarnivore}")
    private String mediumSizedCarnivore;

    @Value("${dinoType.mediumSizedHerbivore}")
    private String mediumSizedHerbivore;

    @Value("${dinoType.mediumSizedPiscivoreCarnivore}")
    private String mediumSizedPiscivoreCarnivore;

    @Value("${dinoType.smallCarnivore}")
    private String smallCarnivore;

    @Value("${dinoType.smallHerbivore}")
    private String smallHerbivore;

    @Value("${dinoType.veryLargeCarnivore}")
    private String veryLargeCarnivore;

    @Value("${dinoType.veryLargeHerbivore}")
    private String veryLargeHerbivore;

    @Value("${dinoType.veryLargePiscivoreCarnivore}")
    private String veryLargePiscivoreCarnivore;

    // Getters for each dinosaur type
    public String getArmoredHerbivore() {
        return armoredHerbivore;
    }

    public String getHybridCarnivore() {
        return hybridCarnivore;
    }

    public String getLargeCarnivore() {
        return largeCarnivore;
    }

    public String getLargeHerbivore() {
        return largeHerbivore;
    }

    public String getMediumSizedCarnivore() {
        return mediumSizedCarnivore;
    }

    public String getMediumSizedHerbivore() {
        return mediumSizedHerbivore;
    }

    public String getMediumSizedPiscivoreCarnivore() {
        return mediumSizedPiscivoreCarnivore;
    }

    public String getSmallCarnivore() {
        return smallCarnivore;
    }

    public String getSmallHerbivore() {
        return smallHerbivore;
    }

    public String getVeryLargeCarnivore() {
        return veryLargeCarnivore;
    }

    public String getVeryLargeHerbivore() {
        return veryLargeHerbivore;
    }

    public String getVeryLargePiscivoreCarnivore() {
        return veryLargePiscivoreCarnivore;
    }

}

