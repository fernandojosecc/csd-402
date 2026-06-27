/**
 * Fernando Contreras
 * Assignment 6.2: Fan Class
 * June 26, 2026
 * CSD-402: Java for Programmers
 *
 * Description: This file defines the Fan class with constants, private
 * fields, getters, setters, two constructors, and a toString() method
 * that describes the current state of the fan.
 */

public class Fan {

    // --- Constants ---
    public static final int STOPPED = 0;
    public static final int SLOW    = 1;
    public static final int MEDIUM  = 2;
    public static final int FAST    = 3;

    // --- Private Fields ---
    private int     speed  = STOPPED;
    private boolean on     = false;
    private double  radius = 6;
    private String  color  = "white";

    // --- No-Argument Constructor ---
    public Fan() {
        this.speed  = STOPPED;
        this.on     = false;
        this.radius = 6;
        this.color  = "white";
    }

    // --- Argument Constructor ---
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed  = speed;
        this.on     = on;
        this.radius = radius;
        this.color  = color;
    }

    // --- Getters ---
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // --- Setters ---
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // --- toString ---
    @Override
    public String toString() {
        String speedLabel;
        switch (speed) {
            case SLOW:   speedLabel = "Slow";    break;
            case MEDIUM: speedLabel = "Medium";  break;
            case FAST:   speedLabel = "Fast";    break;
            default:     speedLabel = "Stopped"; break;
        }

        if (on) {
            return "Fan is ON  | Speed: " + speedLabel +
                   " | Radius: " + radius +
                   " | Color: "  + color;
        } else {
            return "Fan is OFF | Color: " + color +
                   " | Radius: " + radius;
        }
    }
}