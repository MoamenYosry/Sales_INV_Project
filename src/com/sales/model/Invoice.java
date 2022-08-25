
package com.sales.model;
/**
 *
 * @author Moamen Yosry
 */
import java.util.ArrayList;

public class Invoice {
    private int nmbr;
    private String date;
    private String user;
    private ArrayList<Line_Class> lines;
    
    public Invoice() {
    }

    public Invoice(int num, String date, String customer) {
        this.nmbr = num;
        this.date = date;
        this.user = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Line_Class line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Line_Class> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getNmbr() {
        return nmbr;
    }

    public void setNmbr(int nmbr) {
        this.nmbr = nmbr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + nmbr + ", date=" + date + ", customer=" + user + '}';
    }
    
    public String getAsCSV() {
        return nmbr + "," + date + "," + user;
    }
    
}
