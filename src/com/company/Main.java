package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> integerList = new ArrayList<>();

        int random;
        for (int i = 0; i < 10 ; i++) {
            random = 1+ (int) (Math.random() * 50);
            integerList.add(random);
        }

        System.out.println(integerList);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Value to find: ");
        int input = keyboard.nextInt();

        for (int i:   integerList ) {
            if(i == input){
                System.out.println(input + " is in the ArrayList.");
                break;
            }
        }
    }
}
