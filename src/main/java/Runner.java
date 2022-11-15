public class Runner {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount("salma", "mounes", "05/10/2000", 555,70);

        System.out.println(bankAccount.name);
        System.out.println(bankAccount.surname);
        System.out.println(bankAccount.DOB);
        System.out.println(bankAccount.account_number);
        System.out.println(bankAccount.balance);

        bankAccount.deposit(50);
        bankAccount.withdraw(10);
        bankAccount.addInterest(0.05);
        System.out.println("Account balance with interest = £" + bankAccount.getBalance());



    }


}


