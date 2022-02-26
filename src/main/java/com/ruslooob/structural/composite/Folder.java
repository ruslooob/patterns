package com.ruslooob.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FilesystemComponent {

    private final List<FilesystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public boolean addFilesystemComponent(FilesystemComponent component) {
        return this.components.add(component);
    }

    public boolean removeFilesystemComponent(FilesystemComponent component) {
        return this.components.remove(component);
    }

    @Override
    public void printInternalFiles() {
        for (FilesystemComponent component : components) {
            component.printInternalFiles();
        }
    }

}
