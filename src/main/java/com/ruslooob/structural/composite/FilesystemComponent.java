package com.ruslooob.structural.composite;

public abstract class FilesystemComponent {
    private String name;

    public FilesystemComponent(String name) {
        this.name = name;
    }

    public abstract void printInternalFiles();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
