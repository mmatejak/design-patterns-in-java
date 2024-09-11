package com.mtjk.patterns.structural.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Component file1 = new Leaf("File1.txt");
        Component file2 = new Leaf("File2.txt");
        Component file3 = new Leaf("File3.txt");

        Composite folder1 = new Composite("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        Composite folder2 = new Composite("Folder2");
        folder2.add(file3);

        Composite rootFolder = new Composite("RootFolder");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        rootFolder.showDetails();
    }
}
