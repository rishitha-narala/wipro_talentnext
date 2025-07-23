package io_streams;


import java.util.*;
import java.io.*;


public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted:");
        char targetChar = sc.nextLine().toLowerCase().charAt(0);  

        int count = 0;

     
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = br.read()) != -1) {
                if (Character.toLowerCase((char) c) == targetChar) {
                    count++;
                }
            }

            System.out.println("File '" + fileName + "' has " + count +
                    " instances of letter '" + targetChar + "'.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}