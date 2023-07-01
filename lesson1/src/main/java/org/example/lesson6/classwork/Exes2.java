package org.example.lesson6.classwork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exes2 {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> setTwo = new HashSet<>(Arrays.asList(3,5,6,7));
        Set<Integer> setTree = new HashSet<>(setOne);
        setTree.retainAll(setTwo);
        System.out.println("setTree = " + setTree);
    }
}
