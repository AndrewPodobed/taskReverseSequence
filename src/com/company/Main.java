package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String str = "Решение задачи";
	char sym [] = str.toCharArray();
	for(int i = sym.length - 1;i >= 0; i--){
        System.out.print(sym[i]);
    }
        System.out.println("");
	/*
	second method
	 */
        String str2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        str2 = scan.nextLine();
        String [] arr = str2.split("");
        for( int j = arr.length - 1; j >= 0; j--){
            System.out.print(arr[j] + " ");

        }


    }
}
