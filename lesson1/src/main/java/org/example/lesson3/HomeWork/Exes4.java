package org.example.lesson3.HomeWork;

import java.util.ArrayList;
import java.util.Random;

public class Exes4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlst.add(rnd.nextInt(-100,100));
        }
        System.out.println(arrlst.toString());
        searchofnum(arrlst);
    }

    private static void searchofnum(ArrayList<Integer> arrlst) {
        int max = arrlst.get(0);
        int min = arrlst.get(0);
        int sum = 0;
        for(int i=0;i<arrlst.size();i++){
            if (arrlst.get(i)>max) max = arrlst.get(i);
            if (arrlst.get(i)<min) min = arrlst.get(i);
            sum=sum+arrlst.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/arrlst.size()));
    }
}
