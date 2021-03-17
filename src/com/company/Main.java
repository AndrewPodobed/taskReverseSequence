package com.company;

public class Main {

    public static void main(String[] args) {
	String str = "Решение задачи";
	char sym [] = str.toCharArray();
	for(int i = sym.length - 1;i >= 0; i--){
        System.out.print(sym[i]);
    }
    }
}
