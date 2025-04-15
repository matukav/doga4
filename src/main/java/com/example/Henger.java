/*
* File: Henger.java
* Author: Viola Máté
* Copyright: 2025, Viola Máté
* Group: II/2/N
* Date: 2025-04-15
* Github: https://github.com/matukav
* Licenc: MIT
*/

package com.example;

public class Henger {
    private double radius;
    private double length;
    private double surface;

    public Henger(double radius, double length, double surface) {
        this.radius = radius;
        this.length = length;
        this.surface = surface;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
}
