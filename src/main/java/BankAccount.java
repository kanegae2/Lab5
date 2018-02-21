import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     *
      */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     * This is a constructor.
     * @param name This is the name.
     * @param accountCategory This is the ammount category.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * THis is the account balance returned.
     * @return It returns it.
     */
    public double getAccountBalance(){
        return this.accountBalance;
    }

    /**
     *
     * @param name This is the parameter.
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }

    /**
     *
     * @return
     */
    public int getAccountNumber(){
        return this.accountNumber;
    }
}