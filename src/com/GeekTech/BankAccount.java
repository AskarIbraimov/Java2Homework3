package com.GeekTech;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        this.amount = sum + amount;
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Сумма снятия больше чем остаток денег на счете ", amount);
        } else {
            this.amount = amount - sum;
            System.out.println("ваш счет:" + amount);

        }
    }
}
