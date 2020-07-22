package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player michal = new Player("Michal", 10, 15);
        System.out.println(michal.toString());
        saveObject(michal);

        michal.setHitPoints(8);
        System.out.println(michal);
        michal.setWeapon("Palka Teleskopowa");
        saveObject(michal);
        //loadObject(michal);
        System.out.println(michal);

        ISaveable warewolf = new MOnster("Warewolf", 20, 40);
        System.out.println(((MOnster) warewolf).getStrenght());
        System.out.println(warewolf);
        saveObject(warewolf);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i <objectToSave.write().size(); i++){
            System.out.println("Saving" + objectToSave.write().get(i) + " to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
