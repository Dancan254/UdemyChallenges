package Challenges.Bank;

import Challenges.Bank.BankChallenge;

public class BankMain {


    public static void main(String[] args) {
        BankChallenge bank = new BankChallenge("40000",
                "ian", "@gmail", "6790730");

        bank.deposit(-5000);
        bank.withdraw(4000);
        bank.deposit(4040);
        bank.showBalance();
        bank.showInfo();

    }
}
