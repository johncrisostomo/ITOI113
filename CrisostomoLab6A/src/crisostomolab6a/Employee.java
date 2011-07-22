/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab6a;
import java.io.*;
import java.util.Date;
import java.text.DecimalFormat;

/**
 *
 * @author arscariosus
 */
public class Employee {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        Date today = new Date();
        SimplePaySlip emp1;

        int number;
        String name;
        double salary;
        int ot;
        double sss = 500.00;
        double pag_ibig = 200.00;
        double philhealth = 100.00;
        double misc = sss + pag_ibig + philhealth;
        


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

        emp1 = new SimplePaySlip(number, name, salary, ot);

        emp1.setPositionAndPayGrade();
        emp1.computeOtPay();
        emp1.computeGrossPay();
        emp1.computeWTax();
        emp1.computeDeductions(misc);
        emp1.computeNetPay();

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
