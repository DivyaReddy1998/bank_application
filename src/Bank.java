public interface Bank {
    public int checkBalance(String password);
    public String addMoney(int amount);

    public String changePassword(String oldPassword, String newPassword);

    public String withdrawAmount(int mount, String password);

    public double rateOfTotalInterest(int years, String password);

}
