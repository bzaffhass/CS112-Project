public abstract class BankAccount {

    private static float lowRate;
    private static float highRate;

    private float balance;
    private String accountName;
    private String accountNumber;

    public static float getLowRate() {
        return lowRate;
    }

    public static void setLowRate(float lowRate) {
        BankAccount.lowRate = (lowRate <  highRate? lowRate : highRate) < 0 ? lowRate : 0;
    }

    public static float getHighRate() {
        return highRate;
    }

    public static void setHighRate(float highRate) {
        BankAccount.highRate = (lowRate <  highRate? highRate : lowRate) > 10? 10 : highRate;
    }

    public float getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount (String accountName, String accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public abstract void printDetails();

    public void deductBalance(float amount){
        balance -= amount;
    }

    public boolean withdraw(float amount){
        if(amount > balance) return false;

        deductBalance(amount);
        return true;
    }
}
