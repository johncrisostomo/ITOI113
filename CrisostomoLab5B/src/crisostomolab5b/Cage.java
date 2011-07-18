/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab5a;

/**
 *
 * @author jsc10993
 */
public class Cage {
    private int length;
    private int width;
    private int height;
    private boolean clean;
    private boolean covered;

    public Cage() {
        this.clean = false;
        this.length = 10;
        this.width = 10;
        this.height = 10;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public void cleaned() {
        System.out.println("This is inside the object's"  +" method cleaned()");
    }

    public boolean isCleaned() {
        return clean;
    }

    public boolean isCovered() {
        return covered;
    }
}

