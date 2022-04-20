package com.company;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите айпи адрес:");
        Scanner sc1=new Scanner(System.in);
        String ip= sc1.nextLine();
        String inpud =ip;
        boolean result=inpud.matches("(((2[0-5]{2})|(2[0-4]\\d)|1\\d{2}|\\d{2}|\\d)\\.){3}((2[0-5]{2})|(2[0-4]\\d|1\\d{2}|\\d{2}|\\d))");
        if(result) {
            System.out.println("Ok");
            try (BufferedWriter f = new BufferedWriter(new FileWriter("c://12//input.txt"))) {
                f.write(inpud);
                System.out.println("файл создан");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        else {
            System.out.println("Error");
        }
    }
}