package com.ruslooob.structural.decorator;

public abstract class Component {
    protected String backgroundColor;
    protected double opacity;
    protected String borderColor;
    protected double borderRadius;
    protected int height;
    protected int width;
    //other fields

    public Component() {
        this.backgroundColor = "white";
        this.opacity = 1;
        this.borderColor = "black";
        this.borderRadius = 0.1;
        this.height = 0;
        this.width = 0;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
    }

}
