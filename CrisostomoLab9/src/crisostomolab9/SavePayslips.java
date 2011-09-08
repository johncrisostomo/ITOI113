/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab9;
import java.io.*;
import java.util.Date;
import java.text.DecimalFormat;

/**
 *
 * @author arscariosus
 */
public class SavePayslips implements Serializable {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        Date today = new Date();
        SimplePayslip[] sps = new SimplePayslip[5];

        int number;
        String name;
        double salary;
        int ot;
        double sss = 500.00;
        double pag_ibig = 200.00;
        double philhealth = 100.00;
        double misc = sss + pag_ibig + philhealth;
        try {
            for(int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println("Employee Payslip");
            System.out.print("Enter Employee Number : ");
            number = Integer.parseInt(input.readLine());
            System.out.print("Enter Employee Name : ");
            name = input.readLine();
            System.out.print("Enter Employee's Basic Salary : ");
            salary = Double.parseDouble(input.readLine());
            System.out.print("Enter Employee's OT Hours : ");
            ot = Integer.parseInt(input.readLine());

            sps[i] = new SimplePayslip(number, name, salary, ot);

            sps[i].setPositionAndPayGrade();
            sps[i].computeOtPay();
            sps[i].computeGrossPay();
            sps[i].computeWTax();
            sps[i].computeDeductions(misc);
            sps[i].computeNetPay();
            }
        } catch(IOException e) {

        }


        System.out.println();
        System.out.println();

        System.out.println(today);
        System.out.println(emp1);
        System.out.println("     Witholding Tax : " + formatter.format(emp1.getWTax()));
        System.out.println("     SSS            : " + formatter.format(sss));
        System.out.println("     Pag-Ibig       : " + formatter.format(pag_ibig));
        System.out.println("     PhilHealth     : " + formatter.format(philhealth));
        System.out.println("\n\nNet Pay : P " + formatter.format(emp1.getNetPay()));


    }

}
