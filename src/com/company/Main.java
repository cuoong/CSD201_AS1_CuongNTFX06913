package com.company;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        mainMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Test1");
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
//            mainMenu();
        }

    }

    /*Create menu*/
    public static void mainMenu() {
        System.out.println("+-------------------Menu------------------+");
        System.out.println("|                 1.Input                 |");
        System.out.println("|                 2.Output                |");
        System.out.println("|                 3.Bubble sort           |");
        System.out.println("|                 4.Selection sort        |");
        System.out.println("|                 5.Insertion sort        |");
        System.out.println("|                 6.Search > value        |");
        System.out.println("|                 7.Search = value        |");
        System.out.println("|                 0.Exit                  |");
        System.out.println("+-----------------------------------------+");
        System.out.println("Please choose: ");
    }
}