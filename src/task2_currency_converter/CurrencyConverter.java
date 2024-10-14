package task2_currency_converter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Константы курсов обмена валют
        final double USD_TO_EUR = 0.92;
        final double USD_TO_GBP = 0.81;
        final double USD_TO_JPY = 136.82;
        final double USD_TO_RUB = 96.12;
        final double USD_TO_CNY = 6.95;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в долларах США: ");
        double usd = scanner.nextDouble();

        System.out.println("Конвертируем " + usd + " долларов США в другие валюты:");
        System.out.println("Евро: " + (usd * USD_TO_EUR) + " EUR");
        System.out.println("Британский фунт: " + (usd * USD_TO_GBP) + " GBP");
        System.out.println("Японская иена: " + (usd * USD_TO_JPY) + " JPY");
        System.out.println("Российский рубль: " + (usd * USD_TO_RUB) + " RUB");
        System.out.println("Китайский юань: " + (usd * USD_TO_CNY) + " CNY");
    }
}

