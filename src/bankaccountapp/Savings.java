package src.bankaccountapp;

public class Savings extends Account {
    //list properties specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    

    //constructor to initialize savings properties

    //list any methods specific to savings account
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        acctNumber = "1" + acctNumber;
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Your Savings Account Features: " +
                "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
    
    public void setRate() {
        rate = getBaseRate()-0.25;
    }

}

