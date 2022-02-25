package com.ruslooob.structural.decorator;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // in main code we write only one code (only for button)
        // therefore our code platform-independent
        List.of(new WindowsButton(), new LinuxButton(), new MacOsButton())
            .forEach(Button::render);
    }

}
