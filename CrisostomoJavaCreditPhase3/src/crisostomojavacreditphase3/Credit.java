/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphase3;
import java.util.Date;
import java.text.DecimalFormat;

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

    public boolean purchase(double amt) {
        if(amt > 1 && amt <= creditLimit && creditLimit >= (((creditBalance + amt) * .03) + amt)) {
            if(creditBalance < creditLimit) {
                //double interest = (creditBalance + amt) * .03;
                creditBalance+=amt;
                double interest = creditBalance*.03;
                creditBalance+=interest;
                //creditBalance += (amt + interest);
                //System.out.println("Successfully purchased item!");
                return true;
            } else {
                //System.out.println("You have exceeded your credit limit!");
                return false;
            }
        } else {
            System.out.println("Invalid amount!");
            return false;
        }
    }

    public boolean payBalance(double amt) {
        if(amt > 1 && amt <= creditBalance && creditBalance != 0) {
            creditBalance -= amt;
            //System.out.println("Successfully paid " + amt + " !");
            return true;
        } else {
            //System.out.println("Invalid amount!");
            return false;
        }
    }

    public String creditInquiry() {
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
       
        
        return "Credit Inquiry" +
                "\nCredit Limit : " + formatter.format(creditLimit - creditBalance) +
                "\nCredit Balance : " + formatter.format(creditBalance);
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
