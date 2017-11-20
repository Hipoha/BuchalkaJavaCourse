package com.buchalka.arrays.L53arraysChallenge;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L53Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int [] values = getIntegers();

        printArray("Generated integers:", values);

        System.out.println();

        int[] sortedValues = sortIntegers(values);

        printArray("Sorted integers:", sortedValues);
    }

    public static int[] getIntegers() {
        int numberOfIntegers;
        System.out.printf("Enter number of integers you want to input: ");
        numberOfIntegers = scanner.nextInt();

        int[] values = new int[numberOfIntegers];

        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(10);
        }
        return values;
    }

    public static void printArray(String message, int[] array) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Integer #" + (i + 1) + ": " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int swaps = 0;
        int temp;
        int i;
        while (true) {
            i = 0;
            while (true) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    swaps++;
                    break;
                }
                if (i == sortedArray.length - 2) {
                    System.out.println("Number of swaps: " + swaps);
                    return sortedArray;
                }
                i++;
            }
        }

    }

}