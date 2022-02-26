package com.ruslooob.structural.composite;

public class File extends FilesystemComponent {

    public File(String name) {
        super(name);
    }

    @Override
    public void printInternalFiles() {
        System.out.println(super.getName());
    }

}
