package src.bankaccountapp;
import java.util.List;
import src.utilities.CSV;
import java.util.LinkedList;
import java.util.List;
public class BankAccountApp {
    
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        
        
        String fileURL = "https://raw.githubusercontent.com/reidroberts24/BankEasy--Bank-Account-App/main/src/utilities/NewBankAccounts.csv"; //need file name
        List<String[]> newAccountHolders = src.utilities.CSV.readFromUrl(fileURL);
        for (String[] accountHolder : newAccountHolders) {
            System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + ssn + " " + accountType + " " + "$" + initDeposit);
           
            if (accountType.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, ssn, initDeposit));
            } else if (accountType.equals("Checking")) {
                System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checking(name, ssn, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("***********");
            acc.showInfo();
        }

        accounts.get((int) Math.random()*accounts.size()).deposit(10000);
        accounts.get((int) Math.random()*accounts.size()).withdraw(3750);
    }
}
