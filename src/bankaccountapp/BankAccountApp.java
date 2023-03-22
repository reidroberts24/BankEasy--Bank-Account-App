package src.bankaccountapp;
import java.util.List;
import src.utilities.CSV;

public class BankAccountApp {
    
    public static void main(String[] args) {
        String file = "";
        List<String[]> newAccountHolders = src.utilities.CSV.read(file);
        
        /* 
        Checking chkacc1 = new Checking("TOM", "123456789", 1500);
        Savings savacc1 = new Savings("Rich", "123456789", 4500);
        savacc1.showInfo();
        //chkacc1.showInfo();
        savacc1.compound();
        */
    }
}
