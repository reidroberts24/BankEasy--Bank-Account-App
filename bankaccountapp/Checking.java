package bankaccountapp;


public class Checking extends Account {
    //list properties specific to a checking account
    private int debitNumber;
    private int debitPIN;


    //constructor to initialize checking account properties
    //debit card
    //PIN
    // 2 as first digit of account
    //list any methods specific to checking account


    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        acctNumber = "2" + acctNumber;
        setDebitCard();
    }

    
    private void setDebitCard() {
        debitNumber = (int)(Math.random()*Math.pow(10,12)); 
        debitPIN = (int)(Math.random()*Math.pow(10,4)); 
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Account Features: " +
                "\nDebit Card Number: " + debitNumber +
                "\nDebit Card PIN: "+ debitPIN
            );
    }

    public void setRate() {
        rate = getBaseRate()*0.15;
    }

}
