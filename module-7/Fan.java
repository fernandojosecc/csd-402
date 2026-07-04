/**
 * Fernando Contreras
 * Assignment 7.2: UseFans Class
 * July 3, 2026
 * CSD-402: Java for Programmers
 *
 * Description: Updated Fan class from Module 6 with 'this' reference
 * used throughout all constructors and setter methods where applicable.
 */

public class Fan {

    // --- Constants ---
    public static final int STOPPED = 0;
    public static final int SLOW    = 1;
    public static final int MEDIUM  = 2;
    public static final int FAST    = 3;

    // --- Private Fields ---
    private int     speed;
    private boolean on;
    private double  radius;
    private String  color;

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
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
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
        switch (this.speed) {
            case SLOW:   speedLabel = "Slow";    break;
            case MEDIUM: speedLabel = "Medium";  break;
            case FAST:   speedLabel = "Fast";    break;
            default:     speedLabel = "Stopped"; break;
        }

        if (this.on) {
            return "Fan is ON  | Speed: " + speedLabel +
                   " | Radius: " + this.radius +
                   " | Color: "  + this.color;
        } else {
            return "Fan is OFF | Color: " + this.color +
                   " | Radius: " + this.radius;
        }
    }
}