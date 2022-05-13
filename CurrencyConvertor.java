package com.company;

import java.util.*;
import java.text.DecimalFormat;
public class CurrencyConvertor{

    public static void main(String[] args){

        double amount, dollar, pound, code, euro, yen, ringgit, rupee;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, Welcome to the Currency Convertor!");
        System.out.println("Which currency you want to convert? ");
        System.out.println("1:Ruppe \t2:Dollar \t3:Pound \t4:Euro \t5:Yen \t6:Ringgit");
        code = sc.nextInt();

        System.out.println("How much money you want to convert? ");
        amount = sc.nextFloat();

        //For amount conversion
        if(code == 1){

            dollar = amount / 77;
            System.out.println("Your " + amount + "Rupee is: " + f.format(dollar) + " Dollar");

            pound = amount / 94;
            System.out.println("Your " + amount + "Rupee is: " + f.format(pound) + " Pound");

            euro = amount / 80;
            System.out.println("Your " + amount + "Rupee is: " + f.format(euro) + " Euro");

            yen = amount / 0.63;
            System.out.println("Your " + amount + "Rupee is: " + f.format(yen) + " Yen");

            ringgit = amount / 16;
            System.out.println("Your " + amount + "Rupee is: " + f.format(ringgit) + " Ringgit");

        }else if(code == 2){
            // For Dollar Conversion
            rupee = amount * 70;
            System.out.println("Your " + amount + "Dollar is: " + f.format(rupee) + " Ruppes");

            pound = amount * 0.78;
            System.out.println("Your " + amount + "Dollar is: " + f.format(pound) + " Pound");

            euro = amount * 0.87;
            System.out.println("Your " + amount + "Dollar is: " + f.format(euro) + " Euro");

            yen = amount * 111.087;
            System.out.println("Your " + amount + "Dollar is: " + f.format(yen) + " Yen");

            ringgit = amount * 4.17;
            System.out.println("Your " + amount + "Dollar is: " + f.format(ringgit) + " Ringgit");

        }else if(code == 3){
            // For Pound Conversion

            rupee = amount * 88;
            System.out.println("Your " + amount + "Pound is: " + f.format(rupee) + " Ruppes");

            dollar = amount * 1.10;
            System.out.println("Your " + amount + "Pound is: " + f.format(dollar) + " Dollar");

            euro = amount * 1.10;
            System.out.println("Your " + amount + "Pound is: " + f.format(euro) + " Euro");

            yen = amount * 140.93;
            System.out.println("Your " + amount + "Pound is: " + f.format(yen) + " Yen");

            ringgit = amount * 5.29;
            System.out.println("Your " + amount + "Pound is: " + f.format(ringgit) + " Ringgit");

        }else if (code == 4){

            // For Euro Conversion

            rupee = amount * 80;
            System.out.println("Your " + amount + "Euro is: " + f.format(rupee) + " Ruppes");

            dollar = amount * 1.14;
            System.out.println("Your " + amount + "Euro is: " + f.format(dollar) + " Dollar");

            pound = amount * 0.90;
            System.out.println("Your " + amount + "Euro is: " + f.format(pound) + " Pound");

            yen = amount * 127.32;
            System.out.println("Your " + amount + "Euro is: " + f.format(yen) + " Yen");

            ringgit = amount * 4.78;
            System.out.println("Your " + amount + "Euro is: " + f.format(ringgit) + " Ringgit");

        }else if (code == 5){

            // For Yen Conversion

            rupee = amount * 0.63;
            System.out.println("Your " + amount + "Yen is: " + f.format(rupee) + " Ruppes");

            dollar = amount * 0.008;
            System.out.println("Your " + amount + "Yen is: " + f.format(dollar) + " Dollar");

            pound = amount * 0.007;
            System.out.println("Your " + amount + " Yen is: " + f.format(pound) + " Pound");

            euro = amount * 0.007;
            System.out.println("Your " + amount + "Yen is: " + f.format(euro) + " Euro");

            ringgit = amount * 0.037;
            System.out.println("Your " + amount + "Yen is: " + f.format(ringgit) + " Ringgit");

        }else if (code == 6){

            // For Ringgit Conversion

            rupee = amount * 16.8;
            System.out.println("Your " + amount + "Ringgit is: " + f.format(rupee) + " Ruppes");

            dollar = amount * 0.239;
            System.out.println("Your " + amount + "Ringgit is: " + f.format(dollar) + " Dollar");

            pound = amount * 0.188;
            System.out.println("Your " + amount + "Ringgit is: " + f.format(pound) + " Pound");

            euro = amount * 0.207;
            System.out.println("Your " + amount + "Ringgit is: " + f.format(euro) + " Euro");

            yen = amount * 26.63;
            System.out.println("Your " + amount + "Ringgit is: " + f.format(yen) + " Yen");
        }else{
            System.out.println("Invalid input");
        }
        System.out.println("Thank you for choosing our Example Programs");
    }
}
