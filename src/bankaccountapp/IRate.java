package src.bankaccountapp;

public interface IRate {
    //write a method to determine base interest rate from external source
    default double getBaseRate() {
        return 2.5;
    }
}
