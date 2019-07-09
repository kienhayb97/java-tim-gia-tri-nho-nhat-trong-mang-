package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 50) {
                System.out.println("Size does not exceed 50");
            }
        } while (size > 50);
        array = new int[size];
        System.out.println("nhap gia tri trong mang: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhap gia tri thu "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++)
        System.out.print(array[i]+"\t");

        int min=array[0];
        for (int i = 0; i < array.length; i++){
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println("\n"+"gia tri nho nhat: "+min);
    }
}
