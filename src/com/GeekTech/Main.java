package com.GeekTech;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount account = new BankAccount();
        account.deposit(20000);

        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                try {
                    account.withDraw(account.getAmount());
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                break;
            }
        }
    }
}
