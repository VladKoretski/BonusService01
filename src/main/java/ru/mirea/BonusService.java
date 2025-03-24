package ru.mirea;

public class BonusService {

    final static int MAX_BONUS = 5000;

    public long bonusCalculation(long purchaseSum, boolean ifRegistered) {

        long bonus;

        if (ifRegistered) {
            bonus = (int) (0.10 * purchaseSum);
        } else {
            bonus = (int) (0.04 * purchaseSum);
        }

        if (bonus > MAX_BONUS) {
            bonus = MAX_BONUS;
        }

        return bonus;
    }
}
