package com.maven;

class Bank {
    double getInterestRate() {
        return 0;
    }
}


class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}


class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.2;
    }
}

public class banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getInterestRate() + "%");

	}

}
