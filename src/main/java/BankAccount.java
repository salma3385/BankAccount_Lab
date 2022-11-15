public class BankAccount {
    public String name;
    public String surname;
    public String DOB;
    public int account_number;
    public double balance;


    //constructor

    public BankAccount(String inputName, String inputSurname, String inputDOB, int inputAccount_number, double inputBalance) {
        this.name = inputName;
        this.surname = inputSurname;
        this.DOB = inputDOB;
        this.account_number = inputAccount_number;
        this.balance = 0;


    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void addInterest(double interestRate) {
        double interest;
        interest = balance * interestRate;
        balance = balance + interest;

    }
    public double getBalance(){
        return balance;
    }

    //GETTERS & SETTERS

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(){
        this.surname = surname;
    }
    public String getDOB(){
        return this.DOB;
    }
    public void setDOB(){
        this.DOB = DOB;
    }
    public int getAccount_number(){
        return this.account_number;
    }
    public void setAccount_number(){
        this.account_number = account_number;
    }
    public double getalance(){
        return this.balance;

    }
    public void setbalance(){
        this.balance = balance;
    }

    }















