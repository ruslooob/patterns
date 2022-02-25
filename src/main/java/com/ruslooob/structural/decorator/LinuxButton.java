package com.ruslooob.structural.decorator;

public class LinuxButton extends Button{

    public LinuxButton() {
        super();
        super.backgroundColor = "default Linux background color";
        super.borderColor = "default Linux border color";
        super.borderRadius = 10.; // default Linux border radius
        super.hoverAnimation = "default Linux animation";
        super.opacity = 0.95; // default Linux opacity
        super.height = 50; // default Linux button height
        super.width = 75; // default Linux button width
    }

    @Override
    public void render() {
        System.out.println("Linux button rendered on screen");
    }
}
