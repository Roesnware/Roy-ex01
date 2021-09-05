/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution01 {
    /*
    Create a program
    scanner 'input' =  create scanner for user input
    print "What is your name? "
    string 'name' = read input from user using 'input' scanner
    print "Hello, string from input , nice to meet you!"
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.printf("Hello, %s, nice to meet you! ", name);
    }

}
