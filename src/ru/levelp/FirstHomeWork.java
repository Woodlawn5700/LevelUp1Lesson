package ru.levelp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by pavelpetrov on 19.02.16.
 */
public class FirstHomeWork {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа a и b  для линейного уровнения a * x + b = 0");
        System.out.println("Введите число а и нажмите enter");
        double a = 0;
        double b = 0;

        while (true) {
            String a1 = reader.readLine();
            if (a1.isEmpty())
                System.out.println("Введите число а и нажмите enter");
            else {
                try {
                    a = Double.parseDouble(a1);
                } catch (NumberFormatException e) {
                    System.out.println("Вводите пожалуйста цифру");
                    continue;
                }
                a = Double.parseDouble(a1);
                break;
            }

        }
        System.out.println("Введите число b и нажмите enter");
        while (true) {
            String b1 = reader.readLine();
            if(b1.isEmpty())
                System.out.println("Введите число b и нажмите enter");
            else {
                try {
                    b =Double.parseDouble(b1);
                }
                catch (NumberFormatException e) {
                    System.out.println("Вводите пожалуйста цифру");
                    continue;
                }
                b = Double.parseDouble(b1);
                break;
            }


        }
        if(a == 0 )
            System.out.println("You are stupid? It's impossible!!!");
        double x = (-b)/a;
        System.out.println("x = " + x);
    }
    }



