package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean addMilk = false;
        double money = 100;
        int Choice;
        String cupSize;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Выберите напиток : ");
        System.out.println("1 - чай\n 2 - кофе");
        Choice = scanner.nextInt();

        System.out.println("Выберите размер :");
        System.out.println(  "S - маленький, M - редний, X - большой");
        scanner.nextLine();
        cupSize = scanner.nextLine();


        System.out.println("Добавить молоко ? выберите - true или false");
        addMilk = scanner.nextBoolean();

        money -= result(addMilk, Choice, cupSize);
        System.out.println("С вас " + money + "грн");
    }

    private static double result(boolean addMilk, int humanChoice, String cupSize) {
        double sum = 0;
        if (humanChoice == 1) {
            sum = createTea(cupSize, humanChoice,addMilk);
        } else if (humanChoice == 2) {
            sum =  createCoffee(addMilk, cupSize,humanChoice);
        }
        return sum;
    }

    private static double createTea(String size,  int Choice,boolean addMilk) {
        String localsize;
        double cost = 0;
        switch (size) {
            case "S":
                localsize = " маленький";

                order(size, Choice,addMilk);
                cost = 1;
                return cost;

            case "M":
                localsize = "средний";

                order(size, Choice,addMilk);
                cost=4;
                return cost ;
            case "X":
                localsize = "большой";
                order(size, Choice,addMilk);
                cost = 7;
                return cost;

        }
        return cost;

    }

    private static double createCoffee(boolean addMilk, String size,  int Choice) {
        String localsize;
        double cost = 0;

        switch (size) {
            case "S":
                localsize = "маленький";

                order(localsize, Choice, addMilk);
                cost = 1;
                return cost;
            case "M":
                localsize = "средний";
                order(localsize, Choice, addMilk);
                cost = 4;
                return cost;
            case "X":

                localsize = "большой";
                order(localsize, Choice, addMilk);
                cost = 7;
                return cost;
        }

        return cost;
    }


    static void order(String size, int Choice, boolean addMilk) {
        if (Choice == 1) {
            System.out.println("Ваш " + size + " чая");

        } else if (Choice == 2) {
            if (addMilk) {
                System.out.println("Ваш " + size + " Кофе с молоком");
            }else{
                System.out.println("Ваш " + size + " Кофе");
            }
        }
    }
}