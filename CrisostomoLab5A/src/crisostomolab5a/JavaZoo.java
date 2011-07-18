/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab5a;

/**
 *
 * @author jsc10993
 */
public class JavaZoo {

    public static String zooName = "Java Park n Zoo";

    public JavaZoo() {

    }

    public String getZooName() {
        return zooName;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZooAnimal myFirstAnimal = new ZooAnimal();
        Cage firstCage = new Cage();
        ZooKeeper myFirstZooKeeper = new ZooKeeper();

        myFirstAnimal.setName("Long Nose");
        myFirstAnimal.setType("Elephant");

        myFirstZooKeeper.setName("John Doe");
        myFirstZooKeeper.setTitle("Atty.John Doe");

        System.out.println("Welcome to " + zooName + "!");
        //ZooKeeper Output
        System.out.println("Zoo Keeper Name : " + myFirstZooKeeper.getName());
        System.out.println("Title : " + myFirstZooKeeper.getTitle());
        System.out.println("Pay Rate : " + myFirstZooKeeper.getPayRate() + "/Hour");
        System.out.println("Does he have a Degree : " + myFirstZooKeeper.hasDegree());

        //Animal Output
        System.out.println();
        System.out.println("Animal Name : " + myFirstAnimal.getName());
        System.out.println("Animal Type : " + myFirstAnimal.getType());
        System.out.println("Animal Age : " + myFirstAnimal.getAge());
        System.out.println("is the Animal Hungry? " + myFirstAnimal.isHungry());

        //Cage Output
        System.out.println();
        System.out.println("Cage Length : " + firstCage.getLength());
        System.out.println("Cage Width : " + firstCage.getWidth());
        System.out.println("Cage Height : " + firstCage.getHeight());
        System.out.println("is the Cage Cleaned? --> " + firstCage.isClean());
        System.out.println("is the Cage Covered? --> " + firstCage.isCovered());
    }

}
