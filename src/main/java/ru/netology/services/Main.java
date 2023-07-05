package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        CalculationRestMonths service = new CalculationRestMonths();

        int income = 100_000; //доход
        int expenses = 60_000; //расходы
        int threshold = 150_000; //порог

        int rest = service.calculate(income, expenses, threshold);

        System.out.println(rest);


    }
}