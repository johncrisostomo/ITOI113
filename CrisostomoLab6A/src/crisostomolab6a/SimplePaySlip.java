/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab6a;
import java.text.DecimalFormat;
/**
 *
 * @author arscariosus
 */
public class SimplePaySlip {
    DecimalFormat formatter = new DecimalFormat("##,##0.00");

    private int employeeNo;
    private String employeeName;
    private String position;
    private String payGrade;
    private double basic;
    public int otHours;
    private double otPay;
    private double wTax;
    private double deductions;
    private double grossPay;
    private double netPay;

    public SimplePaySlip(int num, String name, double basic, int hours) {
        this.employeeNo = num;
        this.employeeName = name;
        this.basic = basic;
        this.otHours = hours;
    }

        /**
     * @param employeeNo the employeeNo to set
     */
    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    /**
     * @param employeeName the employeeName to set
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * @param payGrade the payGrade to set
     */
    public void setPositionAndPayGrade() {
        if((int)basic >= 8000 && (int)basic < 12000) {
            this.position = "Technician";
            if((int)basic < 10000) {
                this.payGrade = "Paygrade A";
            } else {
                this.payGrade ="Paygrade B";
            }
        }
        if((int)basic >= 12000 && (int)basic < 18000) {
            this.position = "Encoder";
            if((int)basic < 15000) {
                this.payGrade ="Paygrade A";
            } else {
                this.payGrade ="Paygrade B";
            }
        }
        if((int)basic >= 18000 && (int)basic <= 25000) {
            this.position = "Programmer";
            if((int)basic < 20000) {
                this.payGrade ="Paygrade A";
            } else {
                this.payGrade ="Paygrade B";
            }
        }
        if((int)basic >= 25000 && (int)basic < 40000) {
            position = "System Analyst";
            if((int)basic < 30000) {
                this.payGrade ="Paygrade A";
            } else {
                this.payGrade ="Paygrade B";
            }
        }
        if((int)basic >= 40000 && (int)basic <= 60000) {
            this.position = "Manager";
            if((int)basic < 60000) {
                this.payGrade ="Paygrade A";
            } else {
                this.payGrade ="Paygrade B";
            }
        }
    }

    /**
     * @param basic the basic to set
     */
    public void setBasic(double basic) {
        this.basic = basic;
    }

    public void setOtHours(int hours) {
        this.otHours = hours;
    }

    public void computeWTax() {
        if(this.position.equals("Technician"))
            this.wTax = grossPay * .10;
        if(this.position.equals("Encoder"))
            this.wTax = grossPay * .12;
        if(this.position.equals("Programmer"))
            this.wTax = grossPay * .15;
        if(this.position.equals("System Analyst"))
            this.wTax = grossPay * .18;
        if(this.position.equals("Manager"))
            this.wTax = grossPay * .20;
    }
    
    public void computeDeductions(double miscellaneous) {
        this.deductions = miscellaneous + wTax;
    }
    
    public void computeOtPay() {
        otPay = (basic * .01) * otHours;
    }

    public void computeGrossPay() {
        grossPay = basic + otPay;
    }

    public void computeNetPay() {
        this.netPay = grossPay - deductions;
    }

    public double getWTax() {
        return this.wTax;
    }

    public double getNetPay() {
        return this.netPay;
    }

    public String toString() {
        return "Employee Number : " + employeeNo + "\n" +
               "Name : " + employeeName + "\n" +
               "Basic salary : " + formatter.format(basic) + "\n" +
               "Position and PayGrade : " + position + " " + payGrade + "\n" +
               "Number of OT Hours : " + otHours + "\n\n" +
               "Gross Pay : P " + formatter.format(grossPay) + "\n\n" +
               "Deductions : " + "\n";
    }
}
