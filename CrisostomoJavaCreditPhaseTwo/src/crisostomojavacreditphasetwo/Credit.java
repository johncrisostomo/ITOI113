/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphasetwo;
import java.text.DecimalFormat;
import java.util.Date;
/**
 *
 * @author arscariosus
 */
public class Credit {
    private int creditAcctNo;
    private double creditBalance;
    private double creditLimit;

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
        if(amt > 1 && amt <= creditLimit && creditLimit >= (((creditBalance + amt) * .03) + amt)) {
            if(creditBalance < creditLimit) {
                //double interest = (creditBalance + amt) * .03;
                creditBalance+=amt;
                double interest = creditBalance*.03;
                creditBalance+=interest;
                //creditBalance += (amt + interest);
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
        Date today = new Date();
        System.out.println(today);
        System.out.println("\tCredit Inquiry");
        System.out.println("Credit Limit : " + formatter.format(creditLimit - creditBalance));
        System.out.println("Credit Balance : " + formatter.format(creditBalance));
        //System.out.println("Remaining Credits : " + formatter.format(creditLimit - creditBalance));
    }
    public boolean validateCreditAccount(int acctNo) {
        if(creditAcctNo == acctNo) {
            return true;
        } else {
            return false;
        }
    }
}
