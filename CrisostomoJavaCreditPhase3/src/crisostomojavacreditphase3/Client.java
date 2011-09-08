/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphase3;
import java.text.DecimalFormat;

/**
 *
 * @author arscariosus
 */
public class Client {
private String name;
    private String address;
    private String bday;
    private int contact;
    private TravelCredit tc;

    public Client() {
        this.name = "";
        this.address = "";
        this. bday = "";
        this.contact = 0;
        this.tc = new TravelCredit();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the bday
     */
    public String getBday() {
        return bday;
    }

    /**
     * @param bday the bday to set
     */
    public void setBday(String bday) {
        this.bday = bday;
    }

    /**
     * @return the contact
     */
    public int getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(int contact) {
        this.contact = contact;
    }

    /**
     * @return the tc
     */
    public TravelCredit getTc() {
        return tc;
    }

    /**
     * @param tc the tc to set
     */
    public void setTc(TravelCredit tc) {
        this.tc = tc;
    }

    public String toString() {
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        return  "Name            : " + this.getName() + "\n" +
                "Address         : " + this.getAddress() + "\n" +
                "Birthday        : " + this.getBday() + "\n" +
                "Contact Number  : " + this.getContact() + "\n" +
                "Current Balance : " + formatter.format(tc.getCreditBalance()) + "\n";
    }
}
