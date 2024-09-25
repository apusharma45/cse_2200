import java.util.Scanner;

abstract class BankAccount {
    String depositorName;
    String typeOfAccount;
    int accountNumber;
    double balance;

    BankAccount(String holderName, int type, int acNo, double bl) {
        if(type == 1) {
            typeOfAccount = "Savings";
        }
        else if(type == 2) {
            typeOfAccount = "FixedDeposit";
        }
        else System.out.println("Invalid account type!");
        depositorName = holderName;
        accountNumber = acNo;
        balance = bl;
    }
    void depositAmount(double amount) {
        balance += amount;
        System.out.println("Succesfully deposited " +amount+ " BDT to your account");
        System.out.println("Current Balance: " +balance+ " BDT");
    }
    void withdrawAmmount(double amount) {
        if(amount < balance) {
            System.out.println("Insufficient fund!");
            System.out.println("Current Balance: " +balance+ " BDT");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Current Balance: " +balance+ " BDT");
        }
    }

    void display() {
        System.out.println("Account Holder Name: " +depositorName);
        System.out.println("Account type: " +typeOfAccount);
        System.out.println("Account Number: " +accountNumber);
        System.out.println("Current Balance: " +balance+ " BDT");
    }
    abstract void calInterest();

}

class Agrani extends BankAccount {
    Agrani(String depositorName, int type, int acNo, double bl) {
        super(depositorName, type, acNo, bl);
    } 
    void calInterest() {
        if(typeOfAccount == "Savings") {
            System.out.println("Interest is : " +balance*1/100+ " BDT");
        }
        else {
            System.out.println("Interest is : " +balance*3/100+ " BDT");
        }
    }
    void displayDetails() {
        System.out.println("........Agrani Bank Limited........");
        display();
    }
    
}

class Sonali extends BankAccount {
    Sonali(String depositorName, int type, int acNo, double bl) {
        super(depositorName, type, acNo, bl);
    } 
    void calInterest() {
        if(typeOfAccount == "Savings") {
            System.out.println("Interest is : " +balance*1/100+ " BDT");
        }
        else {
            System.out.println("Interest is : " +balance*2/100+ " BDT");
        }
    }
    void displayDetails() {
        System.out.println("........Sonali Bank Limited........");
        display();
    }
    
}

class Janata extends BankAccount {
    Janata(String depositorName, int type, int acNo, double bl) {
        super(depositorName, type, acNo, bl);
    } 
    void calInterest() {
        if(typeOfAccount == "Savings") {
            System.out.println("Interest is : " +balance*1/100+ " BDT");
        }
        else {
            System.out.println("Interest is : " +balance*2.5/100+ " BDT");
        }
    }
    void displayDetails() {
        System.out.println("........Janata Bank Limited........");
        display();
    } 
}

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankName = sc.nextLine();
        String depositorName = sc.nextLine();
        int typeOfAccount = sc.nextInt();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();

        if(bankName == "Agrani") {
            Agrani ag1 = new Agrani(depositorName, typeOfAccount, accountNumber, balance);
        }
        

        


    }
}
