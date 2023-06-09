package org.example.lesson6.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
public class Exes1{
    public static void main(String[] args) {
        Laptop lap1=new Laptop("XOne",0001,"Xiaomi");
        lap1.setColor("black");
        lap1.setHDD(700);
        lap1.setOS("Windows");
        lap1.setRAM(8);

        Laptop lap2=new Laptop("XQW1",0002,"Samsung");
        lap2.setColor("white");
        lap2.setHDD(1000);
        lap2.setOS("Windows");
        lap2.setRAM(8);

        Laptop lap3=new Laptop("XQW2",0003,"Samsung");
        lap3.setColor("red");
        lap3.setHDD(900);
        lap3.setOS("Windows");
        lap3.setRAM(16);

        Laptop lap4=new Laptop("NoteG2",0004,"HP");
        lap4.setColor("black");
        lap4.setHDD(700);
        lap4.setOS("Linux");
        lap4.setRAM(8);

        Laptop lap5=new Laptop("MAC01",0005,"Apple");
        lap5.setColor("silver");
        lap5.setHDD(1000);
        lap5.setOS("macOS");
        lap5.setRAM(4);

        HashSet <Laptop> laptops = new HashSet<>(Arrays.asList(lap1,lap2,lap3,lap4,lap5));
        HashSet <Laptop> res = new HashSet<>();

        zadanie1(laptops, res);


    }

    private static void zadanie1(HashSet<Laptop> laptops, HashSet<Laptop> res) {
        System.out.println("Здравствуйте");
        System.out.print("Выберите критерий:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
            if(n==1){
                System.out.println("Введите минимальный RAM");
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("RAM", temp);
            }
            if(n==2){
                System.out.println("Введите минимальный объем HDD" );
                Integer temp = sc.nextInt();
                sc.nextLine();
                filters.put("HDD", temp);
            }
            if(n==3){
                System.out.println("Введите ОС");
                String temp = sc.nextLine();
                filters.put("OS", temp);
            }
            if(n==4){
                System.out.println("Введите цвет");
                String temp = sc.nextLine();
                filters.put("color", temp);
            }
            System.out.print("Выберите критерий:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 5, чтобы осуществить поиск\n");
            n = sc.nextInt();
            sc.nextLine();
        }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("HDD")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("OS")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop)it.next();
                    if(lap.getOS().equals(entry.getValue())){
                        res.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    Laptop lap = (Laptop)it.next();
                    if(lap.getColor().equals(entry.getValue())){
                        res.add(lap);
                    }
                }
            }
        }

        Iterator it = res.iterator();
        while(it.hasNext()){
            Laptop lap = (Laptop)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
    }
}
