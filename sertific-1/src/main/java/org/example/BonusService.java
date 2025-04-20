package org.example;

public class BonusService {

    final static int MAX_BONUS = 5000;

    public long bonusCalculation(long puchaseSum, boolean ifRegistered) {
        int bonus;
        if (ifRegistered) {
            bonus = (int) (0.10 * puchaseSum);
        } else {
            bonus = (int) (0.04 * puchaseSum);
        }
        if (bonus > MAX_BONUS) {
            bonus = MAX_BONUS;
        }
        return bonus;
    }
}

