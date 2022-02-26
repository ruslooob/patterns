package com.ruslooob.structural.composite;

public class Main {

    public static void main(String[] args) {
        Folder folderA = new Folder("folderA");
        Folder folderB = new Folder("folderB");

        FilesystemComponent fileA = new File("fileA");
        FilesystemComponent fileAA = new File("fileAA");
        FilesystemComponent fileB = new File("fileB");
        FilesystemComponent fileBB = new File("fileBB");

        Folder rootFolder = new Folder("/");

        folderA.addFilesystemComponent(fileA);
        folderA.addFilesystemComponent(fileAA);
        folderA.addFilesystemComponent(fileB);
        folderA.addFilesystemComponent(fileBB);

        rootFolder.addFilesystemComponent(folderA);
        rootFolder.addFilesystemComponent(folderB);

        rootFolder.printInternalFiles();

    }

}
