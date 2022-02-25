package com.ruslooob.structural.decorator;

public class MacOsButton extends Button {
    
    public MacOsButton() {
        super();
        super.backgroundColor = "default MacOs background color";
        super.borderColor = "default MacOs border color";
        super.borderRadius = 5.; // default MacOs border radius
        super.hoverAnimation = "default MacOs animation";
        super.opacity = 1; // default MacOs opacity 
        super.height = 50; // default MacOs button height
        super.width = 100; // default macOS button width
    }

    @Override
    public void render() {
        System.out.println("MacOs button rendered on screen");
    }
}
