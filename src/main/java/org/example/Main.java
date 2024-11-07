package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        while(true){
            System.out.println("Which exercise do you want to see 1-xx? (close program with non number:");
            try{
                int num = scan.nextInt();
                switch(num){
                    case 1:
                        exercise1();
                        break;
                    default:
                        System.out.println("There is no such exercise.");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Closing");
                System.exit(0);
            }
        }
    }
    public static void exercise1(){
        System.out.println("Creating a array list, arrList, of type string: ");
        ArrayList<String> arrList = new ArrayList<>();
        System.out.println("Adding 3 snus elements to list: ");
        arrList.add("General");
        arrList.add("Kronan");
        arrList.add("Ettan");
        System.out.println("arrList: ");
        for(String element : arrList){
            System.out.println(element);
        }
        var scan = new Scanner(System.in);
        System.out.println("Which element should \"Röda Lacket\" have in this list(0-3)? :");
        int ele = scan.nextInt();
        arrList.add(ele, "Röda Lacket");
        System.out.println("arrList: ");
        for(String element : arrList){
            System.out.println(element);
        }
        System.out.println("--------------");
    }
}