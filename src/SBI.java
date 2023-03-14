import java.util.UUID;

public class SBI implements Bank{
    private int balance;
    private String password;
    private String account_No;
    private String name;
    public static double rateOfInterest;
    public SBI(int balance, String password, String name) {
        this.account_No = UUID.randomUUID().toString();
        this.balance = balance;
        this.password = password;
        this.name = name;
    }
    @Override
    public int checkBalance(String password) {
        if(this.password == password){
            return balance;
        }
        return -1;
    }
    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "you have added " + amount + " in your account and the total balance is " + balance;
    }
    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password == oldPassword){
            this.password = newPassword;
            return " You have changed the password successfully";
        }
        else {
            return "Invalid password";
        }
    }
    @Override
    public String withdrawAmount(int mount, String password) {
        if(password == this.password){
            if(mount > balance){
                return " Insufficient balance in your account ";
            }
            else {
                balance = balance - mount;
                return "you have withdrawn the amount of " + mount + " and the total balance left in your account is "+ balance;
            }
        }
        else {
            return "Invalid password";
        }
    }
    @Override
    public double rateOfTotalInterest(int years, String password) {
        double interest = (balance * rateOfInterest*years)/100;
        return interest;
    }
}
