package com.nikijv.hometask1;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        try {
            task12();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
    //<editor-fold desc="Task 1">
    public static void task1(){
        System.out.println("\"Your time is limited,");
        System.out.println("\t so don't waste it");
        System.out.println("\t\t living someone else's life\"");
        System.out.println("\t\t\t\t Steve Jobs");
    }
    //</editor-fold>
    //<editor-fold desc="Task 2">
    public static void task2(){
        System.out.print("Value - ");
        double value = scanner.nextDouble();
        System.out.print("Percent - ");
        double percent = scanner.nextDouble();
        double result = value / 100 * percent;
        System.out.println((int)percent + "% of value " + (int)value + " is " + result);
    }
    //</editor-fold>
    //<editor-fold desc="Task 3">
    public static void task3(){
        double result = 0;
        for(int i = 1; i <= 3; i++)
        {
            System.out.print("Value " + i + " - ");
            double value = scanner.nextInt();
            result += value * Math.pow(10, 3 - i);
        }
        System.out.println("Result = " + (int)result);
    }
    //</editor-fold>
    //<editor-fold desc="Task 4">
    public static void task4() throws Exception {
        long []array = new long[6];
        System.out.print("Insert value: ");
        long value = scanner.nextLong();
        long temp = value;
        for(int i = 0; i < 5; i++){
            temp /= 10;
        }
        if(temp > 0 && temp < 10){
            for(int i = 0; i < 6; i++){
                double number = value / Math.pow(10, 6 - i - 1);
                array[i] = (long)number;
                double modifier = (long)number * Math.pow(10, 6 - i - 1);
                value -= (long)modifier;
            }
            for(int i = 0; i < 2; i++){
                temp = array[i];
                array[i] = array[5 - i];
                array[5 - i] = temp;
            }
            long result = 0;
            for(int i = 0; i < 6; i++){
                double modifier = Math.pow(10, 6 - i - 1);
                result += array[i] * (long)modifier;
            }
            System.out.println("Result = " + result);
        }
        else
            throw new Exception("You entered wrong value");
    }
    //</editor-fold>
    //<editor-fold desc="Task 5">
    public static void task5() throws Exception{
        System.out.print("Month number - ");
        int value = scanner.nextInt();
        if(value < 1 || value > 12)
            throw new Exception("You entered incorrect number");
        if(value == 1 || value == 2 || value == 12)
            System.out.println("Winter");
        else if(value < 6)
            System.out.println("Spring");
        else if(value < 9)
            System.out.println("Summer");
        else
            System.out.println("Autumn");
    }
    //</editor-fold>
    //<editor-fold desc="Task 6">
    public static void task6() {
        System.out.print("Meters - ");
        double meters = scanner.nextDouble();
        int userChoice = 0;
        while(true) {
            System.out.print("To:\n1. miles\n2. inches\n3. yards\n");
            userChoice = scanner.nextInt();
            if(userChoice < 1 || userChoice > 3)
                System.out.print("Wrong choice\n");
            else
                break;
        }
        double result = switch (userChoice) {
            case 1 -> meters * 0.000621371;
            case 2 -> meters * 39.3701;
            case 3 -> meters * 1.09361;
            default -> 0;
        };
        System.out.println("Result = " + result);
    }
    //</editor-fold>
    //<editor-fold desc="Task 7">
    public static void task7(){
        System.out.print("Value 1 - ");
        int value1 = scanner.nextInt();
        System.out.print("Value 2 - ");
        int value2 = scanner.nextInt();
        int start = 0;
        int finish = 0;
        if(value1 <= value2) {
            start = value1;
            finish = value2;
        }
        else{
            start = value2;
            finish = value1;
        }
        for(int i = start; i <= finish; i++){
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
    }
    //</editor-fold>
    //<editor-fold desc="Task 8">
    public static void task8(){
        System.out.print("Start - ");
        int start = scanner.nextInt();
        System.out.print("Finish - ");
        int finish = scanner.nextInt();
        if(start > finish){
            int temp = start;
            start = finish;
            finish = temp;
        }
        for(int i = start; i <= finish; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }
    //</editor-fold>
    //<editor-fold desc="Task 9">
    public static void task9(){
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = random.nextInt(-9, 10);
        }
        int min = array[0];
        int max = array[0];
        int negativesCount = 0;
        int positivesCount = 0;
        int zerosCount = 0;
        for(int i = 0; i < 9; i++){
            if(array[i + 1] < min)
                min = array[i + 1];
            if(array[i + 1] > max)
                max = array[i + 1];
        }
        for(int i = 0; i < 10; i++){
            if(array[i] < 0)
                negativesCount++;
            else if(array[i] > 0)
                positivesCount++;
            else
                zerosCount++;
        }
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nMaximum: " + max + "\nMinimum: " + min + "\nPositives: " + positivesCount + "\nNegatives: " + negativesCount + "\nZeros: " + zerosCount );
    }
    //</editor-fold>
    //<editor-fold desc="Task 10">
    public static void task10(){
        int []arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = random.nextInt( -9,10);
        }
        int evensCount = 0;
        int oddsCount = 0;
        int negativesCount = 0;
        int positivesCount = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] % 2 == 0)
                evensCount++;
            if(arr[i] % 2 != 0)
                oddsCount++;
            if(arr[i] < 0)
                negativesCount++;
            if(arr[i] > 0)
                positivesCount++;
        }
        int[] evensArray = new int[evensCount];
        int index1 = 0;
        int[] oddsArray = new int[oddsCount];
        int index2 = 0;
        int[] negativesArray = new int[negativesCount];
        int index3 = 0;
        int[] positivesArray = new int[positivesCount];
        int index4 = 0;
        for(int i = 0; i < 10; i++){
            if(arr[i] % 2 == 0) {
                evensArray[index1] = arr[i];
                index1++;
            }
            if(arr[i] % 2 != 0) {
                oddsArray[index2] = arr[i];
                index2++;
            }
            if(arr[i] < 0) {
                negativesArray[index3] = arr[i];
                index3++;
            }
            if(arr[i] > 0) {
                positivesArray[index4] = arr[i];
                index4++;
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Evens: ");
        for(int i = 0; i < evensCount; i++){
            System.out.print(evensArray[i] + " ");
        }
        System.out.println();
        System.out.print("Odds: ");
        for(int i = 0; i < oddsCount; i++){
            System.out.print(oddsArray[i] + " ");
        }
        System.out.println();
        System.out.print("Negatives: ");
        for(int i = 0; i < negativesCount; i++){
            System.out.print(negativesArray[i] + " ");
        }
        System.out.println();
        System.out.print("Positives: ");
        for(int i = 0; i < positivesCount; i++){
            System.out.print(positivesArray[i] + " ");
        }
    }
    //</editor-fold>
    //<editor-fold desc="Task 11">
    public static void task11(int size, String direction, char character) throws Exception {
        if(Objects.equals(direction, "Horizontal")) {
            for (int i = 0; i < size; i++) {
                System.out.print(character + " ");
            }
        }
        else if(Objects.equals(direction, "Vertical")) {
            for (int i = 0; i < size; i++) {
                System.out.println(character);
            }
        }
        else
            throw new Exception("Wrong direction value");
    }
    //</editor-fold>
    //<editor-fold desc="Task 12">
    public static void task12(){
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = random.nextInt( 10);
        }
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int userChoice = 0;
        while(true){
            System.out.println("1. Ascending");
            System.out.println("2. Descending");
            userChoice = scanner.nextInt();
            if(userChoice == 1 || userChoice == 2)
                break;
            System.out.println("Wrong choice");
        }
        if(userChoice == 1){
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9 - i; j++){
                    if(array[j] > array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        else{
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9 - i; j++){
                    if(array[j] < array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
    }
    //</editor-fold>
}