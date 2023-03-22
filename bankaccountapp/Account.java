package bankaccountapp;

public abstract class Account implements IRate {
    //list common properties for savings and checking accounts
    private String name;
    private String ssn;
    protected String acctNumber;
    private double balance;
    protected double rate;
    static int index = 10000;
    //constructor to set base properties and intialize the account
    //list common methods
    //deposit
    //withdraw
    //show
    //transfer


    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = initDeposit;
        //balance = initDeposit;
        this.acctNumber = setAcctNumber();
        setRate();
      
    }

    //GENERATING THE ACCOUNT NUMBER
        //11 digit acct
        // 1 or 2 dpeneding on savings or checking
        //last two digits of SSN
        //unique 5 digit number
        //random 3 digits
    private String setAcctNumber() {
        String lastTwoOfSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random()*Math.pow(10,3));

        return lastTwoOfSSN + uniqueID+randomNumber;
    }

    public void showInfo() {
        System.out.println(
            "NAME: " + name +
            "\nAccount Number: " + acctNumber +
            "\nBalance: " + balance +
            "\nRate: " + rate + "%"
            
        );
    }

    public abstract void setRate();

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" +amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" +amount);
        printBalance();

    }
    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" +amount + " to "+ toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }

    public void compound() {
        double accruedInterest = balance * rate/100;
        balance = balance + accruedInterest;
        printBalance();
    }
}