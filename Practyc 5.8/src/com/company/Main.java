package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int t = b.nextInt();
        Perevirka(t);
        Chislo(t);
        int oldPoverh = 0;
        String choice = c.nextLine();
        switch (choice) {
            case "Yes":
            case "Так":
            case "ОК":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь");
                break;
            case "NO":
            case "No":
            case "Ні":
            case "-":
                System.out.println("Я відмовляюсь");
        }
        int x = 0;
        while (x < 3) {
            int floor = b.nextInt();

            System.out.println(oldPoverh);
            if (floor == 2 && floor > oldPoverh) {
                System.out.println("Ви піднялись на  " + 3 + " поверх");
            }
            if (floor == 2 && floor < oldPoverh) {
                System.out.println("Ви спустилитсь на  " + 1 + " поверх");
            } else if (floor > oldPoverh && floor != 2) {
                System.out.println("Ви піднялись на  " + floor + " поверх");
            } else if (floor < oldPoverh && floor != 2) {
                System.out.println("Ви спустились на  " + floor + " поверх");
            }
            oldPoverh = floor;
            x++;
        }

    }

    private static void Chislo(int t) {
        System.out.println("Найбільше число   " + Collections.max(Arrays.asList(Integer.toString(t).split(""))));
    }


    public static void Perevirka(int n) {
        if (n > 100 && n < 50) {
            System.out.println("Число  " + n + "  не потрапило до проміжку (50;100)");
        } else {
            System.out.println("Число  " + n + "  потрапило до проміжку (50;100)");
        }
    }
}


