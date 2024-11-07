package org.example;

import java.util.*;

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
                    case 2:
                        exercise2();
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
    public static void exercise2(){
        System.out.println("Creating List list of type string with 3 broccolis: ");
        List<String> list = new ArrayList<String>();
        list.add("SuperBroccoli");
        list.add("GoodBroccoli");
        list.add("GreenBroccoli");
        System.out.println("Each element in list: ");
        for(String element : list){
            System.out.println(element);
        }
        System.out.println("Adding \"123Broccoli\" to element 2 :");
        list.add(2, "123Broccoli");
        for(String element : list){
            System.out.println(element);
        }
        System.out.println("Sorting list in a new sortedList: ");
        List<String> sortedList = list.stream().sorted().toList();
        for(String element : sortedList){
            System.out.println(element);
        }
        System.out.println("-------------");
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