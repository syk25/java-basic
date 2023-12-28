package oop.ex;

public class Account {
    int balance;

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다.");
    }
    public void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다.");
        } else {
            System.out.println("잔액이 " + (amount - balance) + "원 만큼 부족합니다.");
        }
    }
    public void checkBalance(){
        System.out.println("현재 잔액은 " + balance + "원 입니다.");
    }

}
