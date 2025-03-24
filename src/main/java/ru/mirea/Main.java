package ru.mirea;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BonusService bonusService = new BonusService();

        long expected = 1000;
        long actual = bonusService.bonusCalculation(10000,true);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Registered User, expected " + expected + " actual " + actual);
    }
}