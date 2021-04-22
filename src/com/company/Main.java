package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       calculator();

    }


    public  static void  calculator (){
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextInt();

        double fivePercent = ((salary /2) / 100) * 5 ;

        double eightPercent = (salary / 100 * 30) / 100 * 8;

        double twentyPercent = ((salary / 100 * 20) / 100 *10);

        System.out.println(fivePercent + twentyPercent + eightPercent);

    }

    }

