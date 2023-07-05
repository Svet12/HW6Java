package ru.netology.services;

public class CalculationRestMonths {
    public int calculate(int income, int expenses, int threshold) {
        int rest = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                rest++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return rest;
    }
}