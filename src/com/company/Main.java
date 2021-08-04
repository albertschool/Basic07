package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q1
        Chocolate choco1 = new Chocolate("Shufersal",24, 557,5.6);
        Chocolate choco2 = new Chocolate("Elite",24, 527,5.5);
        Chocolate choco3 = new Chocolate("Shufersal",24, 592,5.8);

        // Q2
        System.out.println("Q2");
        System.out.println(choco1.toString());
        System.out.println(choco2.toString());
        System.out.println(choco3.toString());

        // Q3
        choco1.setPrice(1.1*choco1.getPrice());
        choco2.setPrice(1.1*choco2.getPrice());
        choco3.setPrice(1.1*choco3.getPrice());

        // Q4
        int minCubes = Math.min(choco1.getCubes(),Math.min(choco2.getCubes(),choco3.getCubes()));
        if (minCubes == choco1.getCubes()) {
            choco1.setCubes(20+choco1.getCubes());
        } else if (minCubes == choco2.getCubes()) {
            choco2.setCubes(20 + choco2.getCubes());
        } else {
            choco3.setCubes(20 + choco3.getCubes());
        }

        // Q5
        double maxPrice = Math.max(choco1.getPrice(),Math.max(choco2.getPrice(),choco3.getPrice()));
        System.out.println("Q5");
        if (maxPrice == choco1.getPrice()) {
            System.out.println(choco1.getManufacturer());
        } else if (maxPrice == choco2.getPrice()) {
            System.out.println(choco2.getManufacturer());
        } else {
            System.out.println(choco3.getManufacturer());
        }

        // Q6
        System.out.println("Q6");
        if (choco1.getCubes()>choco2.getCubes()) {
            if (choco1.getCubes()> choco3.getCubes()) {
                System.out.println(choco1.toString());
                if (choco2.getCubes()>choco3.getCubes()) {
                    System.out.println(choco2.toString());  // 1,2,3
                    System.out.println(choco3.toString());
                } else {
                    System.out.println(choco3.toString());  // 1,3,2
                    System.out.println(choco2.toString());
                }
            } else {
                System.out.println(choco3.toString());      // 3,1,2
                System.out.println(choco1.toString());
                System.out.println(choco2.toString());
            }
        } else if (choco2.getCubes()>choco3.getCubes()) {
            System.out.println(choco2.toString());
            if (choco1.getCubes()>choco3.getCubes()) {
                System.out.println(choco1.toString());      // 2,1,3
                System.out.println(choco3.toString());
            } else {
                System.out.println(choco3.toString());      // 2,3,1
                System.out.println(choco1.toString());
            }
        } else {
            System.out.println(choco3.toString());          // 3,2,1
            System.out.println(choco2.toString());
            System.out.println(choco1.toString());
        }

        // Q7
        int minCal = Math.min(choco1.getCalories(),Math.min(choco2.getCalories(),choco3.getCalories()));
        System.out.println("Q7");
        if (minCal == choco1.getCalories()) {
            System.out.println(choco1.toString());
        } else if (minCal == choco2.getCalories()) {
            System.out.println(choco2.toString());
        } else {
            System.out.println(choco3.toString());
        }

        // Q8
        Chocolate choco4 = new Chocolate(choco1);
    }
}