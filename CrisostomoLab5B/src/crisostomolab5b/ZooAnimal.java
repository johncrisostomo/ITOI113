/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab5a;

/**
 *
 * @author jsc10993
 */
public class ZooAnimal {
    private String name;
    private String type;
    private int age;
    private boolean hungry;

    public ZooAnimal() {
        this.age = 0;
        this.hungry = false;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return hungry;
    }

}
