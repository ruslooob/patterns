package com.ruslooob.structural.decorator;

public class WindowsButton extends Button {

    public WindowsButton() {
        super();
        super.backgroundColor = "default Windows background color";
        super.borderColor = "default Windows border color";
        super.borderRadius = 5.; // default windows border radius
        super.hoverAnimation = "default Windows animation";
        super.opacity = 1; // default windows opacity
        super.height = 50; // default windows button height
        super.width = 100; // default windows button width
    }

    @Override
    public void render() {
        System.out.println("Windows button rendered on screen");
    }

}
