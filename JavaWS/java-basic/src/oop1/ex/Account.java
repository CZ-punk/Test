package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금액: " + amount + ", 현재 잔액: " + balance);
    }
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족, 잔고: " + balance);
        } else {
            balance -= amount;
            System.out.println("출금액: " + amount + ", 현재 잔액: " + balance);
        }
    }



}
