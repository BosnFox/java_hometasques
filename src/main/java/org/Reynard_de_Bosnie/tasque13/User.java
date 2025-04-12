package org.Reynard_de_Bosnie.tasque13;

public class User implements java.io.Serializable
{
    private String name;
    private int age;
    private String mylo;
    public User(String name, int age, String mylo) {
        this.name = name;
        this.age = age;
        this.mylo = mylo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMylo() {
        return mylo;
    }
    public void setMylo(String mylo) {
        this.mylo = mylo;
    }
}
