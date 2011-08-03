/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphaseone;

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


}
