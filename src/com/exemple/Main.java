package com.exemple;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FileSystem system = new FileSystem();

        Directory root = createStructure();
        system.addRoot(root);

        interact(system);
    }

    private static Directory createStructure() {

        Directory mainFolder = new Directory("principal");

        FileItem fileA = new FileItem("rapport.docx", 2000);
        FileItem fileB = new FileItem("photo.jpg", 350000);

        Directory subFolder = new Directory("documents");
        subFolder.add(new FileItem("cv.pdf", 50000));

        mainFolder.add(fileA);
        mainFolder.add(fileB);
        mainFolder.add(subFolder);

        return mainFolder;
    }

    private static void interact(FileSystem system) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Contenu du système ===");
        system.listAll();

        System.out.println("\nTaille totale actuelle : " + system.totalSize() + " B");

        scanner.close();
    }
}
