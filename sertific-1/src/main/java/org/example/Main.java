package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService bonusService = new BonusService();
        long expected = 1000;
        long actual = bonusService.bonusCalculation(1000, true);

        System.out.printf("Registrered User, expected" + expected + "actual" + actual);
    }
}
