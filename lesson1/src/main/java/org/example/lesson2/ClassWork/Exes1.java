package org.example.lesson2.ClassWork;

public class Exes1 {
    public static void main(String[] args){
        int[] array = {2, 6, 5, 8, 5, 6, 2};
        System.out.println("polidrom(array) = " + polidrom(array));
    }

    /**
     *
     * @param array Входной массив
     * @return результат
     */
    private static boolean polidrom(int[] array) {
        int len = array.length -1;
        for (int i = 0; i < array.length/2; i++){
            if (array[i] != array[len - i]) return false;
            }
        return true;
        }
    }

