/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphase3;
import javax.swing.*;


/**
 *
 * @author arscariosus
 */
public class TravelCredit extends Credit {
    public TravelCredit() {
        this.setCreditAcctNo(0);
        this.setCreditBalance(0);
        this.setCreditLimit(0);
    }
    public boolean purchase(double amt) {
        if(amt >= 100 && amt <= this.getCreditLimit() && this.getCreditLimit() >= (((this.getCreditBalance() + amt) * .03) + amt)) {
            if(this.getCreditBalance() < this.getCreditLimit()) {
                //double interest = (creditBalance + amt) * .03;
                this.setCreditBalance(this.getCreditBalance() + amt);
                double interest = this.getCreditBalance()*.03;
                this.setCreditBalance(this.getCreditBalance() + interest);
                //creditBalance += (amt + interest);
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
        if(amt >= 100 && amt <= this.getCreditBalance() && this.getCreditBalance() != 0) {
            this.setCreditBalance(this.getCreditBalance() - amt);
            //System.out.println("Successfully paid " + amt + " !");
            return true;
        } else {
            System.out.println("Invalid amount!");
            return false;
        }
    }

}
