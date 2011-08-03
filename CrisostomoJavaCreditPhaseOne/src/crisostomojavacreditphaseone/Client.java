/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphaseone;
import java.io.*;
import java.util.Random;
/**
 *
 * @author arscariosus
 */
public class Client {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int displayMenu() throws Exception {
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\tJava Bank Main Menu");
        System.out.println("[1] New Credit Account");
        System.out.println("[2] Credit Inquiry");
        System.out.println("[3] Purchases");
        System.out.println("[4] Payment");
        System.out.println("[5] Close Credit Account");
        System.out.println("[6] Exit");

        return Integer.parseInt(choice.readLine());
    }

    public static void createNewCreditAcct(Credit ca) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        double annualIncome;

        System.out.print("Please enter annual income : ");
        annualIncome = Double.parseDouble(input.readLine());

        if(annualIncome>=299999 && annualIncome <= 200000)
            ca.setCreditBalance(30000);
        else if(annualIncome == 300000)
            ca.setCreditBalance(50000);
        else
            ca.setCreditBalance(100000);

        ca.setCreditAcctNo(rand.nextInt(9999));
    }


    }

}
