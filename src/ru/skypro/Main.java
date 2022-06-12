package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //  Задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        //  Задание 2

        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        }

        //  Задание 3

        int year = 2012;
        int leapYear1 = (year % 4);
        int leapYear2 = (year % 400);
        boolean isThisALeapYear1 = leapYear1 == 0;
        boolean isThisALeapYear2 = leapYear2 == 0;
        if (isThisALeapYear1) {
            System.out.println(year + " год является високосным");
        } else if (isThisALeapYear2) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }

        // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        // Задание 6

        double age = 24;
        double salary = 48_000;
        double creditCardLimitCofficient = 1;
        double creditCardLimit = 1;
        if (salary >= 50_000) {
            creditCardLimitCofficient = creditCardLimitCofficient * 1.2;
        } else if (salary >= 80_000) {
            creditCardLimitCofficient = 1.5;
        } else {
            creditCardLimitCofficient = creditCardLimitCofficient * 1;
        }
        if (age >= 23) {
            creditCardLimit = creditCardLimit * 3 * salary * creditCardLimitCofficient;
        } else {
            creditCardLimit = creditCardLimit * 2 * salary * creditCardLimitCofficient;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditCardLimit);

        //  Задание 7

        int Age = 25;
        int wantedSum = 330_000;
        double creditRate = 10;
        int creditPeriod = 12;
        int Sallary = 70_000;
        double monthlyCreditPayment;
        if (Age < 23) {
            creditRate = creditRate + 1;
        } else {
            if (Age < 30) {
                creditRate = creditRate + 0.5;
            }
            }
        if (Sallary > 80_000) {
            creditRate = creditRate - 0.7;
        }
        monthlyCreditPayment = wantedSum * ((creditRate / 100) + 1) / 12;
        if (monthlyCreditPayment <= (Sallary / 2)) {
            System.out.println("Одобрено");
        } else {
            System.out.println("Отказано");
        }

    }
}
