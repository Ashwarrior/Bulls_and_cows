package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String secret=scanner.nextLine();
	String guess=scanner.nextLine();
        System.out.println(Bullandcow(secret,guess));
    }

    private static String Bullandcow(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < guess.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if (s == g) bulls++;
            else {
                if (numbers[s] < 0) {
                    cows++;
                }
                if (numbers[g] > 0) {
                    cows++;
                }
                numbers[s]++;
                numbers[g]--;
            }
        }

        return bulls + "A" + cows + "B";

    }
}
