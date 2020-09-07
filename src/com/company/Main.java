package com.company;

public class Main {

    public static void main(String[] args) {
        byte years = 18;
        short days = 6851;
        int hours = 164424;
        long milliseconds=591926400000L;
        float study_in_Germany = 1.5f;
        double sqrt_of_my_age = 4.24264;
        char first_letter= 'V';
        boolean scholarship = true;
        String name = "Vova";

        System.out.println("My name is " + name);
        System.out.println("I live for " + years + " years, " + days + " days, " + hours + " hours and "
                + milliseconds +  " milliseconds.");
        System.out.println("I have studied in Germany for " + study_in_Germany + " years");
        System.out.println("Square root of my age is " +sqrt_of_my_age);
        System.out.println("The first letter of  my name is " + first_letter);

        if (scholarship) {
            System.out.println("I have the scholarship");
        }
        else System.out.println("I dont have the scholarship");
    }
}
