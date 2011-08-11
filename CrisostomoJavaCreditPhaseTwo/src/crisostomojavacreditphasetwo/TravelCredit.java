/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphasetwo;

/**
 *
 * @author arscariosus
 */
public class TravelCredit extends Credit{

    public void purchase(double amt) {
        if(amt >= 100 && amt <= this.getCreditLimit() && this.getCreditLimit() >= (((this.getCreditBalance() + amt) * .03) + amt)) {
            if(this.getCreditBalance() < this.getCreditLimit()) {
                //double interest = (creditBalance + amt) * .03;
                this.setCreditBalance(this.getCreditBalance() + amt);
                double interest = this.getCreditBalance()*.03;
                this.setCreditBalance(this.getCreditBalance() + interest);
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
        if(amt >= 100 && amt <= this.getCreditBalance() && this.getCreditBalance() != 0) {
            this.setCreditBalance(this.getCreditBalance() - amt);
            System.out.println("Successfully paid " + amt + " !");
        } else {
            System.out.println("Invalid amount!");
        }
    }

}
