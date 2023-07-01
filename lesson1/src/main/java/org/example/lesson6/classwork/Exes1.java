package org.example.lesson6.classwork;

import java.util.*;

public class Exes1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3));
        Set<Integer> set = new HashSet<>(list);
//        for (Integer integer : list){
//            set.add(integer);
//        }

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        int result = set.size()*100/ list.size();
        System.out.println("result = " + result);
    }
}
