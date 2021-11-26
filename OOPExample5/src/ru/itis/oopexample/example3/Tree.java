package ru.itis.oopexample.example3;

public class Tree {
    int height;
    String name;

    public Tree(String name, int height) {
        System.out.println("Tree constructor");
        this.height = height;
        this.name = name;
    }

    void print() {
        System.out.println("Tree, name: " + name + ", height: " + height);
    }

    void growUp() {
        height++;
    }

    static void printClassName() {
        System.out.println("CLASS TREE");
    }
}
