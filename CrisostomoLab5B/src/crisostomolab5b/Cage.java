/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab5b;

/**
 *
 * @author arscariosus
 */
public class Cage {
    //attributes
    private int length;
    private int width;
    private int height;
    private boolean clean;
    private boolean covered;

    //constructor
    public Cage()
    {
        this.length = 10;
        this.width = 10;
        this.height = 10;
        this.clean = false;
        this.covered = true;
    }
    public Cage(int length,int width,int height,boolean clean,boolean covered)
    {
        this.length = length;
        this.width = width;
        this.height = height;
        this.clean = clean;
        this.covered = covered;
    }


    //setters

    public void setLength(int length)
    {
        this.length = length;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    //getters
    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void cleaned()
    {
        if(isClean() == true)
        {
            System.out.println("it is Cleaned!");
        }
        else if(isClean() == false)
        {
            System.out.println("Cage is Dirty!");
        }
    }

    public boolean isClean()
    {
        return clean;
    }

    public boolean isCovered()
    {
        return covered;
    }

}

