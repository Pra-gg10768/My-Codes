package com.spring.app;

import java.util.Scanner;

import org.springframework.stereotype.Component;

// Type your code here
@Component
public class EasyBank {

	private int pinCode = 6789;
	private int balance = 10000;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doWithdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Fund");
        } else {
            balance -= amount;
            System.out.println("You have successfully withdrawn " + amount);
        }
    }

    public void doDeposit(int amount) {
        balance += amount;
        System.out.println("Your balance is " + balance);
    }

    public void doChangePin(int oldPin, int newPin) {
        if (oldPin == pinCode && newPin >= 1000 && newPin <= 9999) {
            pinCode = newPin;
        } else {
            throw new RuntimeException("Invalid Pin");
        }
    }

    public void showBalance() {
        System.out.println("Your balance is " + balance);
    }

}