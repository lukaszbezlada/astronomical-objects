package com.lukaszbezlada.utils;

import lombok.*;

public class MessierObject  {

    private int id;
    private String messierNumber;
    private String NGCNumber;
    private String name;
    private String type;
    private Long distance;
    private Long brightness;
    private String imgPath;

    public MessierObject(int id, String messierNumber, String NGCNumber, String name, String type, Long distance, Long brightness, String imgPath) {
        this.id = id;
        this.messierNumber = messierNumber;
        this.NGCNumber = NGCNumber;
        this.name = name;
        this.type = type;
        this.distance = distance;
        this.brightness = brightness;
        this.imgPath = imgPath;
    }

    public MessierObject() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessierNumber(String messierNumber) {
        this.messierNumber = messierNumber;
    }

    public void setNGCNumber(String NGCNumber) {
        this.NGCNumber = NGCNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public void setBrightness(Long brightness) {
        this.brightness = brightness;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getId() {
        return id;
    }

    public String getMessierNumber() {
        return messierNumber;
    }

    public String getNGCNumber() {
        return NGCNumber;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Long getDistance() {
        return distance;
    }

    public Long getBrightness() {
        return brightness;
    }

    public String getImgPath() {
        return imgPath;
    }
}