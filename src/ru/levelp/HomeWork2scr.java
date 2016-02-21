package ru.levelp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pavelpetrov on 21.02.16.
 */
public class HomeWork2scr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ВВедите 3 числа квадратного уровнения ");

        double a = 0;
        double b = 0;
        double c = 0;

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

        System.out.println("Введите число c и нажмите enter");
        while (true) {
            String c1 = reader.readLine();
            if(c1.isEmpty())
                System.out.println("Введите число c и нажмите enter");
            else {
                try {
                    c =Double.parseDouble(c1);
                }
                catch (NumberFormatException e) {
                    System.out.println("Вводите пожалуйста цифру");
                    continue;
                }
                c = Double.parseDouble(c1);
                break;
            }
        }

        double x1 = 0;
        double x2 = 0;

        if (a == 0 && b == 0)
            System.out.println("решения не имеент");
        else if (a == 0){
            x1 = (-c)/b;
            System.out.println("x1 = " + x1);
             }
        else {
            if((b * b - 4 * a * c)< 0)
                System.out.println("нет действительных корней");
            else {
                double diskr = Math.sqrt(b * b - 4 * a * c);
                x1 = ((-b) + diskr) / 2 * a;

                System.out.println("x1 = " + x1);
                if (diskr > 0) {
                    x2 = ((-b) - diskr) / 2 * a;
                    System.out.println("x2 = " + x1);
                }
            }
        }
    }
}
