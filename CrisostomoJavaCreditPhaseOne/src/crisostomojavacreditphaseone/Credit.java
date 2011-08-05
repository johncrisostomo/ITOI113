/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphaseone;
import java.text.DecimalFormat;
/**
 *
 * @author arscariosus
 */
public class Credit {
    private int creditAcctNo;
    private double creditBalance;
    private double creditLimit;

    public Credit() {

    }

    /**
     * @return the creditAcctNo
     */
    public int getCreditAcctNo() {
        return creditAcctNo;
    }

    /**
     * @param creditAcctNo the creditAcctNo to set
     */
    public void setCreditAcctNo(int creditAcctNo) {
        this.creditAcctNo = creditAcctNo;
    }

    /**
     * @return the creditBalance
     */
    public double getCreditBalance() {
        return creditBalance;
    }

    /**
     * @param creditBalance the creditBalance to set
     */
    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }

    /**
     * @return the creditLimit
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * @param creditLimit the creditLimit to set
     */
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void purchase(double amt) {
        if(amt > 1 && amt <= creditLimit) {
            if(creditBalance < creditLimit) {
                double interest = amt * .03;
                creditBalance += (amt + interest);
                System.out.println("Successfully purchased item!");
            } else {
                System.out.println("You have exceeded your credit limit!");
            }
        } else {
            System.out.println("Invalid amount!");
        } 
    }

    public void payBalance(double amt) {
        if(amt > 1 && amt <= creditBalance && creditBalance != 0) {
            creditBalance -= amt;
            System.out.println("Successfully paid " + amt + " !");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void creditInquiry() {
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        System.out.println("\tCredit Inquiry");
        System.out.println("Credit Limit : " + formatter.format(creditLimit));
        System.out.println("Credit Balance : " + formatter.format(creditBalance));
    }
    public boolean validateCreditAccount(int acctNo) {
        if(creditAcctNo == acctNo) {
            return true;
        } else {
            return false;
        }
    }
}
