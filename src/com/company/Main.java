package com.company;

public class Main {

    public static void main(String[] args) {
        byte numberOfTeams = 10;
        byte numberOfRacers = 20;
        char formula1 = 'F';
        String bestTeam = "Mercedes";
        int salaryInDollars = 60_000_000;
        long salaryInHryvnias = 1_687_170_000;
        short kilometers = 305;
        float fastestPitStop = 1.88f;
        double averageTimeOfPitStop = 2.5;
        boolean isDangerous = true;
        System.out.println("Нещодавно я відкрив для себе такий " + "вид " +
                "спорту, як автомобільні гонки, а саме \""+ formula1 + "-1.\"" +
                "\nВ кожній гонці приймає участь " + numberOfTeams +
                " команд, у кожній по 2 гонщика, отже на трасі всього " +
                numberOfRacers + " суперників.\nЗараз домінує " +
                "команда " + bestTeam + " яка виграє вже 6 років " +
                "поспіль. \n5 з цих виграшів приніс команді пілот " +
                "Льюіс Хемільтон. \nЙого зарплата складає " + salaryInHryvnias +
                " гривень, або " + salaryInDollars + "$ в рік." +
                "\nГонка триває не більше двох годин, а відстань, яку," +
                " в середньому, проїхає пілот складає - " + kilometers +
                " кілометрів. \nКожна команда має змінити хоча би " +
                "один раз тип шин, це робиться на піт-стопі.\nВ середньому" +
                " це займає " + averageTimeOfPitStop +" секунд, а самий" +
                " швидкий піт-стоп був зроблений командою Red Bull за " +
                fastestPitStop + " секунд. \nЯкщо ви мене запитаєте, чи є " +
                "автогонка небезпечним видом спорту, я вам відповім: ");
        if(isDangerous){
            System.out.println("Однозначно так! Кожного разу " +
                    "виїзжджаючи на трасу пілот ризикує попасти" +
                    " в аварію та травмуватись, тому цей вид " +
                    "спорту є надзвичайно небезпечним.");
        }
    }
}
